package com.example.project.controller.api;

import com.example.project.model.DTO.OrderDTO;
import com.example.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/new/{userIdx}")
    public void create(@PathVariable Long userIdx, @RequestBody OrderDTO orderDTO){
        orderService.create(userIdx, orderDTO);
    }

    @GetMapping("/list/{userIdx}")
    public List<OrderDTO> list(@PathVariable Long userIdx){
        List<OrderDTO> orderDTOList = orderService.getOrderList(userIdx);
        return orderDTOList;
    }

    @PutMapping("/ready")
    public void updateReady(@RequestBody OrderDTO orderDTO) {
        orderService.updateReady(orderDTO);
    }

    @PutMapping("/send")
    public void updateSend(@RequestBody OrderDTO orderDTO) {
        orderService.updateSend(orderDTO);
    }

    @PutMapping("/finish")
    public void updateFinish(@RequestBody OrderDTO orderDTO) {
        orderService.updateFinish(orderDTO);
    }

    @PutMapping("/cancle")
    public void updateCancle(@RequestBody OrderDTO orderDTO) {
        orderService.updateCancle(orderDTO);
    }

    @PutMapping("/returning")
    public void updateReturning(@RequestBody OrderDTO orderDTO) {
        orderService.updateReturning(orderDTO);
    }

    @PutMapping("/returned")
    public void updateReturned(@RequestBody OrderDTO orderDTO) {
        orderService.updateReturned(orderDTO);
    }
}
