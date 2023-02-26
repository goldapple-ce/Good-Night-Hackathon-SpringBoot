package com.example.goodnignt;

import com.example.goodnignt.domain.restaurant.domain.repository.RestaurantRepository;
import com.example.goodnignt.domain.restaurant.service.RestaurantService;
import com.example.goodnignt.domain.review.service.ReviewService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReviewTests {
    @InjectMocks
    private ReviewService reviewService;

//    @Autowired
//    private RestaurantService restaurantService;
    @Mock
    private RestaurantRepository restaurantRepository;

    @BeforeAll


    @Test
    void createReview(){

    }

}
