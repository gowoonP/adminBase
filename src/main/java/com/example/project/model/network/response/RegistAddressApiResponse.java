package com.example.project.model.network.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegistAddressApiResponse {
    private Long rgaIdx;
    private Long userIdx;
    private String rgaRevname;
    private String rgaZipcode;
    private String rgaUserhp;
    private String rgaAddress1;
    private String rgaAddress2;
    private String rgaRevaddname;
}
