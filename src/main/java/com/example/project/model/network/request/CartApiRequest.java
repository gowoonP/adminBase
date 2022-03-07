package com.example.project.model.network.request;

import com.example.project.model.entity.Goods;
import com.example.project.model.entity.User;
import com.example.project.model.network.response.GoodsApiResponse;
import com.example.project.model.network.response.UserApiResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CartApiRequest {
    private Long cartIdx;
    private Long cartUseridx;
}
