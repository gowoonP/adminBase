package com.example.project.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderApiResponse {
    private Long orderIdx;
    private Long userIdx;
    private Long orderNum;
    private LocalDateTime orderRegdate;
    private String orderSeller;
    private String orderStatus;
    private Long goodsidx;
}
