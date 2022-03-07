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
public class ReviewApiResponse {
    private Long rvIdx;
    private Long userIdx;
    private LocalDateTime rvRegdate;
    private String rvTitle;
    private String rvContent;
    private Integer rvStar;
    private String rvImg;
}
