package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;


public interface RestaurantService {
    public Long createRestaurant(RestaurantRequestDto response) throws Exception;
    public RestaurantResponseDto getRestaurantInfo(Long id) throws Exception;
}
