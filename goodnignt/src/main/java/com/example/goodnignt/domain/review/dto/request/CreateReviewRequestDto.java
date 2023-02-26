package com.example.goodnignt.domain.review.dto.request;

import com.example.goodnignt.domain.restaurant.dto.requestDto.CreateRestaurantRequestDto;
import com.example.goodnignt.domain.review.domain.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreateReviewRequestDto {
    private Long restaurantId;
    private String title;
    private String content;
}
