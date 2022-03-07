package com.example.project.controller.api;

import com.example.project.controller.CrudController;
import com.example.project.model.entity.Goods;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.GoodsApiRequest;
import com.example.project.model.network.response.GoodsApiResponse;
import com.example.project.service.CartApiLogicService;
import com.example.project.service.GoodsApiLogicService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //json으로 주고 받는 컨트롤러
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodsController extends CrudController<GoodsApiRequest, GoodsApiResponse, Goods> {
    /*
    {
        "transaction_time":"2022-03-04",
            "resultCode":"ok",
            "description":"ok",
            "data":{
        "gdName":"test",
                "gdPrice":"100000",
                "gdCount":"10",
                "gdBrand":"duoback",
                "gdSaleprice":"10000",
                "gdCategory":"duoback",
                "gdSalepercent":"5",
                "gdHit":"1",
                "gdImg":"gd",
                "gdOption":"",
                "gdContent":"gd",
                "gdDetailimg":"gd"
    }
    }

     */

    private final GoodsApiLogicService goodsApiLogicService;

    @Override
    @PostMapping("/new")
    public Header<GoodsApiResponse> create(@RequestBody Header<GoodsApiRequest> request){
        return goodsApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<GoodsApiResponse> read(@PathVariable(name="id") Long id) {
        return goodsApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<GoodsApiResponse> update(@RequestBody Header<GoodsApiRequest> request) {
        return goodsApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<GoodsApiResponse> delete(@PathVariable(name="id") Long id) {
        return goodsApiLogicService.delete(id);
    }

    @GetMapping("") // http://localhost:8080/goods
    public Header<List<GoodsApiResponse>> search(@PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable){
        return goodsApiLogicService.search(pageable);
    }

    @GetMapping("/list") // http://localhost:8080/goods/list
    public Header<List<GoodsApiResponse>> allGoodsView(){
        return goodsApiLogicService.allGoodsView();
    }

    @GetMapping("/list/category") // http://localhost:8080/goods/list/category?gdCategory=*
    public Header<List<GoodsApiResponse>> allGoodsViewCategory(String gdCategory){
        return goodsApiLogicService.allGoodsViewCategory(gdCategory);
    }

    @GetMapping("/list/brand") // http://localhost:8080/goods/list/brand?gdBrand=*
    public Header<List<GoodsApiResponse>> allGoodsViewBrand(String gdBrand){
        return goodsApiLogicService.allGoodsViewBrand(gdBrand);
    }


}
