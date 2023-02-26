package com.example.goodnignt.domain.review.dto.mapper;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.review.domain.entity.Review;
import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    public Review toEntity(CreateReviewRequestDto request, Restaurant restaurant) {
        return Review.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .restaurant(restaurant).build();
    }
}

