package com.example.project.model.network.response;

import com.example.project.model.entity.Goods;
import com.example.project.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartApiResponse {
    private Long cartIdx;
    private Long cartUseridx;

    private List<GoodsApiResponse> goodsApiResponseList;

}
