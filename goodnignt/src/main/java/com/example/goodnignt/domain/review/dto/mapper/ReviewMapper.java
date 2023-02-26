package com.example.goodnignt.domain.review.dto.mapper;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.review.domain.entity.Review;
import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import com.example.goodnignt.domain.review.dto.response.GetReviewResponse;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapper {
    public Review toEntity(CreateReviewRequestDto request, Restaurant restaurant) {
        return Review.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .restaurant(restaurant).build();
    }

    public GetReviewResponse toGetReviewResponse(Review review){
        return GetReviewResponse.builder()
                .restaurantId(review.getRestaurant().getName())
                .title(review.getTitle())
                .content(review.getContent()).build();
    }
}

