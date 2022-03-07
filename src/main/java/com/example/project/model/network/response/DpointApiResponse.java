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
public class DpointApiResponse {
    private Long dpIdx;
    private LocalDateTime dpRegdate;
    private LocalDateTime dpEnddate;
    private String dpContent;
    private Integer dpPp;
    private Integer dpMp;
    private Integer dpSum;
    private Long dpuserIdx;
}
