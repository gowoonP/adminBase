package com.example.project.controller.api;

import com.example.project.controller.CrudController;
import com.example.project.model.entity.Cart;
import com.example.project.model.entity.Goods;
import com.example.project.model.entity.User;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.CartApiRequest;
import com.example.project.model.network.response.CartApiResponse;
import com.example.project.service.CartApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController extends CrudController<CartApiRequest, CartApiResponse, Cart> {

    private final CartApiLogicService cartApiLogicService;

    @Override
    public Header<CartApiResponse> create( Header<CartApiRequest> request) {
        return null;
    }


    @Override
    public Header<CartApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<CartApiResponse> update(Header<CartApiRequest> request) {
        return null;
    }

    @Override
    public Header<CartApiResponse> delete(Long id) {
        return null;
    }


//    @PostMapping("/new")
//    public void create2(@RequestBody User user, @RequestBody  Goods newGoods ) {
//         cartApiLogicService.create(user, newGoods);
//    }
}
