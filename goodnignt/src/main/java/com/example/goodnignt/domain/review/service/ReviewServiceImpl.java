package com.example.goodnignt.domain.review.service;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.restaurant.domain.repository.RestaurantRepository;
import com.example.goodnignt.domain.review.domain.entity.Review;
import com.example.goodnignt.domain.review.domain.repository.ReviewRepository;
import com.example.goodnignt.domain.review.dto.mapper.ReviewMapper;
import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import com.example.goodnignt.domain.review.dto.request.UpdateReviewRequestDto;
import com.example.goodnignt.domain.review.dto.response.GetReviewResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public Long createReview(CreateReviewRequestDto request) throws Exception {
        Restaurant restaurant = restaurantRepository.findById(request.getRestaurantId()).orElseThrow(null);
        Review review = reviewMapper.toEntity(request,restaurant);
        return reviewRepository.save(review).getId();
    }

    @Override
    public void deleteReview(Long id) throws Exception {
        reviewRepository.deleteById(id);
    }

    @Override
    public GetReviewResponse getReviewById(Long id) throws Exception {
        Review review =  reviewRepository.findById(id).orElseThrow(null);
        return reviewMapper.toGetReviewResponse(review);
    }

    @Override
    public void updateReview(UpdateReviewRequestDto request) {
        Review review = reviewRepository.findById(request.getId()).orElseThrow();
        review.update(request);
        reviewRepository.save(review);
    }
}
