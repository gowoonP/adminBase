package com.example.project.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecentApiResponse {
    private Long rcIdx;
    private Long rcUseridx;
    private Long rcGoodsidx;
    private String rcGoodsname;
    private Integer rcGoodsprice;
    private Integer rcGoodssaleprice;
    private String rcGoodsimg;
}
