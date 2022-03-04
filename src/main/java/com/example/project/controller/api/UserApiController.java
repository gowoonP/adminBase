package com.example.project.controller.api;

import com.example.project.controller.CrudController;
import com.example.project.model.entity.Users;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.UserApiRequest;
import com.example.project.model.network.response.UserApiResponse;
import com.example.project.model.network.response.UserOrderInfoApiResponse;
import com.example.project.service.UserApiLogicService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, Users> {

    private final UserApiLogicService userApiLogicService;

    /*{
        "transaction_time":"2022-02-22",
        "resultCode":"ok",
        "description":"ok",
        "data":{
            "userid":"kim",
            "userpw":"1111",
            "email":"kim@kim.com",
            "hp":"010-0000-0000"
     }
    }*/

    public UserApiController(final UserApiLogicService userApiLogicService) {
        this.userApiLogicService = userApiLogicService;
    }

    @Override
    @PostMapping({""}) // http://localhost:8080/api/user (post)
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        System.out.println(request);
        return this.userApiLogicService.create(request);
    }

    // http://localhost:8080/api/user/apple
    @Override
    @GetMapping({"{id}"}) // http://localhost:8080/api/user/{id}  (get)
    public Header<UserApiResponse> read(@PathVariable(name = "id") Long id) {
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping({""}) // http://localhost:8080/api/user (put)
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override
    @DeleteMapping({"{id}"}) // http://localhost:8080/api/user/{id} (delete)
    public Header<UserApiResponse> delete(@PathVariable(name = "id") Long id) {
        return userApiLogicService.delete(id);
    }

    @GetMapping("") // http://localhost:8080/api/user
    public Header<List<UserApiResponse>> findAll(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC)Pageable pageable){
        return userApiLogicService.search(pageable);
    }

    @GetMapping("/{id}/orderInfo") // http://localhost:8080/api/user/1/orderInfo (get)
    public Header<UserOrderInfoApiResponse> orderInfo(@PathVariable Long id){
        return userApiLogicService.orderInfo(id);
    }
}
