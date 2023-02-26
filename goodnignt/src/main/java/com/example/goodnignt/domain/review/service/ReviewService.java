package com.example.goodnignt.domain.review.service;

import com.example.goodnignt.domain.review.domain.entity.Review;
import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import com.example.goodnignt.domain.review.dto.request.UpdateReviewRequestDto;
import com.example.goodnignt.domain.review.dto.response.GetReviewResponse;

public interface ReviewService {
    public Long createReview(CreateReviewRequestDto request) throws Exception;
    public void deleteReview(Long id) throws Exception;
    public GetReviewResponse getReviewById(Long id) throws Exception;
    public void updateReview(UpdateReviewRequestDto request) throws Exception;

}
