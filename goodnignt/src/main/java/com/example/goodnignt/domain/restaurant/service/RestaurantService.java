package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;

import java.util.List;


public interface RestaurantService {
    public Long createRestaurant(RestaurantRequestDto response) throws Exception;
    public RestaurantResponseDto getRestaurantInfo(Long id) throws Exception;
    public List<RestaurantResponseDto> getAllRestaurantInfo() throws Exception;
    public List<RestaurantResponseDto> getAllRestaurantInfo(String category) throws Exception;
}
