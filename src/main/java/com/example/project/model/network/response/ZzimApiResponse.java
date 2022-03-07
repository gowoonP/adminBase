package com.example.project.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZzimApiResponse {
    private Long zzIdx;
    private Long userIdx;
    private Long goodsIdx;
}
