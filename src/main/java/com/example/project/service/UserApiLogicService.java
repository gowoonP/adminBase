package com.example.project.service;

import com.example.project.model.entity.OrderGroup;
import com.example.project.model.entity.Users;
import com.example.project.model.enumclass.UserStatus;
import com.example.project.model.network.Header;
import com.example.project.model.network.Pagination;
import com.example.project.model.network.request.UserApiRequest;
import com.example.project.model.network.response.ItemApiResponse;
import com.example.project.model.network.response.OrderGroupApiResponse;
import com.example.project.model.network.response.UserApiResponse;
import com.example.project.model.network.response.UserOrderInfoApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service    // 서비스 레이어, 내부에서 자바로직을 처리함
@RequiredArgsConstructor
public class UserApiLogicService extends BaseService<UserApiRequest, UserApiResponse, Users> {

    private final OrderGroupApiLogicService orderGroupApiLogicService;
    private final ItemApiLogicService itemApiLogicService;

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();
        Users users = Users.builder()
                .userid(userApiRequest.getUserid())
                .userpw(userApiRequest.getUserpw())
                .hp(userApiRequest.getHp())
                .email(userApiRequest.getEmail())
                .status(UserStatus.REGISTERED)
                .build();
        Users newUsers = baseRepository.save(users);
        return Header.OK(response(newUsers));
    }


    @Override
    public Header<UserApiResponse> read(Long id) {
        return baseRepository.findById(id)
                .map(users -> response(users))
                .map(Header::OK)
                .orElseGet(
                        () -> Header.ERROR("데이터 없음")
                );
    }


    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        UserApiRequest userApiRequest = request.getData();
        Optional<Users> users = baseRepository.findById(userApiRequest.getId());

        return users.map(user -> {
                    user.setUserid(userApiRequest.getUserid());
                    user.setUserpw(userApiRequest.getUserpw());
                    user.setHp(userApiRequest.getHp());
                    user.setEmail(userApiRequest.getEmail());
                    user.setStatus(userApiRequest.getStatus());

                    return user;
                }).map(user -> baseRepository.save(user))
                .map(user -> response(user))
                .map(Header::OK)
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }


    @Override
    public Header delete(Long id) {
        Optional<Users> users = baseRepository.findById(id);

        return users.map(user -> {
            baseRepository.delete(user);
            return Header.OK();
        }).orElseGet(() -> Header.ERROR("데이터 없음"));
    }


    private UserApiResponse response(Users users) {
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .id(users.getId())
                .userid(users.getUserid())
                .userpw(users.getUserpw())
                .email(users.getEmail())
                .hp(users.getHp())
                .regDate(users.getRegDate())
                .status(users.getStatus())
                .build();
        return userApiResponse;
    }


    public Header<List<UserApiResponse>> search(Pageable pageable) {
        Page<Users> user = baseRepository.findAll(pageable);
        List<UserApiResponse> userApiResponseList = user.stream()
                .map(users -> response(users))
                .collect(Collectors.toList());

        Pagination pagination = Pagination.builder()
                .totalPages(user.getTotalPages())
                .totalElements(user.getTotalElements())
                .currentPage(user.getNumber())
                .currentElements(user.getNumberOfElements())
                .build();
        return Header.OK(userApiResponseList, pagination);
    }

    public Header<UserOrderInfoApiResponse> orderInfo(Long id) {
        Users users = baseRepository.getById(id);
        UserApiResponse userApiResponse = response(users);

        List<OrderGroup> orderGroupList = users.getOrderGroupList();
        List<OrderGroupApiResponse> orderGroupApiResponseList = orderGroupList.stream()
                .map(orderGroup -> {
                    OrderGroupApiResponse orderGroupApiResponse = orderGroupApiLogicService.response(orderGroup).getData();
                    List<ItemApiResponse> itemApiResponseList = orderGroup.getOrderDetailList().stream()
                            .map(orderDetail -> orderDetail.getItem())
                            .map(item -> itemApiLogicService.response(item).getData())
                            .collect(Collectors.toList());

                    orderGroupApiResponse.setItemApiResponseList(itemApiResponseList);
                    return orderGroupApiResponse;
                }).collect(Collectors.toList());

        userApiResponse.setOrderGroupApiResponseList(orderGroupApiResponseList);
        UserOrderInfoApiResponse userOrderInfoApiResponse = UserOrderInfoApiResponse.builder()
                .userApiResponse(userApiResponse)
                .build();
        return Header.OK(userOrderInfoApiResponse);
    }
}