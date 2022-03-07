package com.example.project.model.network.response;

import com.example.project.model.enumclass.CouponStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponApiResponse {
    private Long cpIdx;
    private Long cpUseridx;
    private Long cpGoodsidx;
    private Long cpDiscount;
    private String cpName;
    private LocalDateTime cpRegdate;
    private LocalDateTime cpStartdate;
    private LocalDateTime cpEnddate;
    private String cpLimitprice;
    private CouponStatus cpStatus;
}
