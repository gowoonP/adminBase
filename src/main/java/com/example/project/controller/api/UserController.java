package com.example.project.controller.api;

import com.example.project.controller.CrudController;
import com.example.project.model.entity.User;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.UserApiRequest;
import com.example.project.model.network.response.UserApiResponse;
import com.example.project.model.network.response.UserCartInfoApiResponse;
import com.example.project.service.UserApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController //json으로 주고 받는 컨트롤러
@RequestMapping("/test")
@RequiredArgsConstructor
public class UserController extends CrudController<UserApiRequest, UserApiResponse, User> {

    private final UserApiLogicService userApiLogicService;

    /*
    {
        "transaction_time":"2022-03-04",
            "resultCode":"ok",
            "description":"ok",
            "data":{
                "userUserid":"banana",
                "userUserpw":"2222",
                "userName":"반하나",
                "userHp":"010-1111-2222",
                "userEmail":"banana@banana.com",
                "userSns":"kakao",
                "userZipcode":"12345",
                "userAddress1":"서울 서초구 역삼동",
                "userAddress2":"코리아아이티학원"
    }
    }
    */

    @Override
    @PostMapping("") //http://localhost:8080/test (post)
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<UserApiResponse> read(@PathVariable(name="id") Long id) {
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<UserApiResponse> delete(@PathVariable(name="id") Long id) {
        return userApiLogicService.delete(id);
    }

//    @GetMapping("") // http://localhost:8080/
//    public Header<List<UserApiResponse>> search(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
//        return userApiLogicService2.search(pageable);
//    }

    @GetMapping("/{id}/cartInfo")
    public Header<UserCartInfoApiResponse> cartInfo(@PathVariable Long id){
        return userApiLogicService.cartInfo(id);
    }

}