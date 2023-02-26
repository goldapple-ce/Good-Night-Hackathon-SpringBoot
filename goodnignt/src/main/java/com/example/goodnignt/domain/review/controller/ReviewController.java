package com.example.goodnignt.domain.review.controller;

import com.example.goodnignt.domain.review.dto.request.CreateReviewRequestDto;
import com.example.goodnignt.domain.review.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
