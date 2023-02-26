package com.example.goodnignt.domain.review.service;

import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;

public interface ReviewService {
    public Long createReview(CreateReviewRequestDto request) throws Exception;
}
