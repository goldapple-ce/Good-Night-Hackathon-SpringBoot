package com.example.goodnignt.domain.review.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetReviewResponse {
    private String restaurantId;
    private String title;
    private String content;
}
