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
public class QnaApiResponse {
    private Long qIdx;
    private Long qUseridx;
    private String qTitle;
    private LocalDateTime qRegdate;
    private String qContent;
    private String qAnswer;
    private Long qNumber;
    private String qCategory;
    private String qStatus;
}
