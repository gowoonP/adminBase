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
public class NoticeApiResponse {
    private Long ntIdx;
    private String ntTitle;
    private LocalDateTime ntRegdate;
    private String ntContent;
    private String ntCategory;
    private Integer ntHit;

}
