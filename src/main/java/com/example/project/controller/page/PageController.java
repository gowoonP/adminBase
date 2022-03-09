package com.example.project.controller.page;

import com.example.project.controller.CrudController;
import com.example.project.model.entity.Goods;
import com.example.project.model.network.Header;
import com.example.project.model.network.request.GoodsApiRequest;
import com.example.project.model.network.request.UserApiRequest;
import com.example.project.model.network.response.GoodsApiResponse;
import com.example.project.model.network.response.UserApiResponse;
import com.example.project.service.GoodsApiLogicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@RequestMapping("/pages") // http://localhost:8080/pages
//public class PageController {
//
//    @Autowired
//    private AdminMenuService adminMenuService;
//
//    @RequestMapping(path = {""})
//    public ModelAndView index(){
//        return new ModelAndView("/pages/index")
//                .addObject("menuList", adminMenuService.getAdminMenu())
//                .addObject("code", "main");
//    }
//
//    @RequestMapping("/user") // http://localhost:8080/pages/user
//    public ModelAndView user(){
//        return new ModelAndView("/pages/user")
//                .addObject("menuList", adminMenuService.getAdminMenu())
//                .addObject("code", "user");
//    }
//}

@AllArgsConstructor
@Controller
@RequestMapping("/admin")
public class PageController {

    private final GoodsApiLogicService goodsApiLogicService;

    @GetMapping("")
    public String admin() { return "index";}

    @GetMapping("/dashboard")
    public String dashboard(){ return "adminpage/dashboard";}

    @GetMapping("/analytics")
    public String analytics() { return "adminpage/analytics";}

    @GetMapping("/memberlist")
    public String memberlist() { return "adminpage/memberlist";}

    @GetMapping("/memberjoin")
    public String memberjoin() { return "adminpage/memberjoin";}

    @GetMapping("/membermail")
    public String membermail() { return "adminpage/membermail";}

    @GetMapping("/answer")
    public String shoppinganswer() { return "adminpage/shoppinganswers";}

    @GetMapping("/cancel")
    public String shoppingcancel() { return "adminpage/shoppingcancel";}

    @GetMapping("/coupon")
    public String shoppingcoupon() { return "adminpage/shoppingcoupon";}

    @GetMapping("/couponfix")
    public String shoppingcouponfix() { return "adminpage/shoppingcouponfix";}

    @GetMapping("/dpoint")
    public String shoppingdpoint() { return "adminpage/shoppingdpoint";}

    @GetMapping("/exchange")
    public String shoppingexchange() { return "adminpage/shoppingexchange";}

//    @GetMapping("/management")
//    public String shoppingmanagement() { return "adminpage/shoppingmanagement";}

    @GetMapping("/management")
    public String shoppingmanagement(Model model){
        model.addAttribute("goodsList", goodsApiLogicService.list());
        return "adminpage/shoppingmanagement";}


//    @GetMapping("/management_add")
//    public String shoppingmanagement_add() { return "adminpage/shoppingManagement_add";}

    @PostMapping({"{management_add}"}) // http://localhost:8080/admin/management_add (post)
    public Header<GoodsApiResponse> create(@RequestBody Header<GoodsApiRequest> request) {
        System.out.println(request);
        return this.goodsApiLogicService.create(request);
    }

    @GetMapping("/management_hide")
    public String shoppingmanagement_hide() { return "adminpage/shoppingManagement_hide";}

    @GetMapping("/management_sale")
    public String shoppingmanagement_sale() { return "adminpage/shoppingManagement_sale";}

    @GetMapping("/management_soldout")
    public String shoppingmanagement_soldout() { return "adminpage/shoppingManagement_soldout";}

//    상품관리 탭 전환 ajax 먹이면 이거 안써도 되는건가
//    @GetMapping("/management1")
//    public String shoppingmanagement1() { return "adminpage/shoppingmanagement1";}
//
//    @GetMapping("/management_sale1")
//    public String shoppingmanagementsale1() { return "adminpage/shoppingmanagement2";}
//
//    @GetMapping("/management_soldout1")
//    public String shoppingmanagementsoldout1() { return "adminpage/shoppingmanagement3";}
//
//    @GetMapping("/management_hide1")
//    public String shoppingmanagementhide1() { return "adminpage/shoppingmanagement4";}

    @GetMapping("/order")
    public String shoppingorder() { return "adminpage/shoppingorder";}

    @GetMapping("/return")
    public String shoppingreturn() { return "adminpage/shoppingreturn";}

    @GetMapping("/review")
    public String shoppingreview() { return "adminpage/shoppingreview";}

    @GetMapping("/visitor")
    public String visitor() { return "adminpage/visitor";}



}
