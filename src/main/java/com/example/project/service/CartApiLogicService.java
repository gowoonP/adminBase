package com.example.project.service;

import com.example.project.ifs.CrudInterface;
import com.example.project.model.entity.Cart;
import com.example.project.model.entity.Goods;
import com.example.project.model.entity.User;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.CartApiRequest;
import com.example.project.model.network.request.UserApiRequest;
import com.example.project.model.network.response.CartApiResponse;
import com.example.project.model.network.response.UserApiResponse;
import com.example.project.repository.CartRepository;
import com.example.project.repository.GoodsRepository;
import com.example.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.apache.el.parser.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {
    @Autowired
    private GoodsRepository goodsRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CartRepository cartRepository;

//    @Transactional
//    public void create(User user, Goods newGoods) {
//        Cart cart = cartRepository.findByUserIdx(user.getUserIdx());
//
//        Goods goods = goodsRepository.findByGdIdx(newGoods.getGdIdx());
//
//
//        Cart cart2 = Cart.builder()
//                .user(cart.getUser())
//                .goods(goods)
//                .build();
//        Cart newCart = cartRepository.save(cart2);
//
//    }


        public Header<CartApiResponse> response(Cart cart) {
            CartApiResponse cartApiResponse = CartApiResponse.builder()
                    .cartIdx(cart.getCartIdx())
                    .cartUseridx(cart.getUser().getUserIdx())
                    .build();
            System.out.println(cart.getUser().getUserIdx());
            return Header.OK(cartApiResponse);

        }

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> delete(Long id) {
        return null;
    }
}





