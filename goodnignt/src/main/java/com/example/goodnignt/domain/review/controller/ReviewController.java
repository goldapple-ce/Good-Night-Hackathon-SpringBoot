package com.example.goodnignt.domain.review.controller;

import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import com.example.goodnignt.domain.review.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/reviews")
@Slf4j
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping
    public Long createReview(@RequestBody CreateReviewRequestDto request) throws Exception {
        return reviewService.createReview(request);
    }

    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable("id") Long id) throws Exception{
        reviewService.deleteReview(id);
    }
}
