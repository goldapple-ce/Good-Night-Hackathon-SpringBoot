package com.example.goodnignt.domain.review.dto.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class UpdateReviewRequestDto {
    private Long id;
    private String title;
    private String content;
}
