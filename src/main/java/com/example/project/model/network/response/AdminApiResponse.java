package com.example.project.model.network.response;

import com.example.project.model.enumclass.AdminStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminApiResponse {
    private Long adminIdx;
    private String adminId;
    private String adminPw;
    private String adminName;
    private AdminStatus adminStatus;

}
