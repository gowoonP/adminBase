package com.example.project.model.network.response;

import com.example.project.model.enumclass.GoodsStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsApiResponse {
    private Long gdIdx;
    private String gdName;
    private Integer gdPrice;
    private Long gdCount;
    private String gdBrand;
    private LocalDateTime gdRegdate;
    private String gdCategory;
    private Integer gdSaleprice;
    private Integer gdSalepercent;
    private Integer gdHit;
    private String gdImg;
    private String gdOption;
    private String gdContent;
    private String gdDetailimg;
    private GoodsStatus gdStatus;

}
