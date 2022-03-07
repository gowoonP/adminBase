package com.example.project.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FaqApiResponse {
    private Long faqIdx;
    private String faqTitle;
    private String faqAnswer;
    private String faqCategory;
    private String faqImg;
}
