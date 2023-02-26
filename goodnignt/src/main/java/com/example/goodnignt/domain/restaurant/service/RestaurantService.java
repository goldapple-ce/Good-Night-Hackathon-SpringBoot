package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.dto.requestDto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.dto.requestDto.UpdateRestaurantRequestDto;

import java.util.List;


public interface RestaurantService {
    public Long createRestaurant(RestaurantRequestDto request) throws Exception;
    public RestaurantResponseDto getRestaurantInfo(Long id) throws Exception;
    public List<RestaurantResponseDto> getAllRestaurantInfo() throws Exception;
    public List<RestaurantResponseDto> getAllRestaurantInfo(String category) throws Exception;

    public void deleteRestaurant(Long id) throws Exception;
    public void updatedRestaurant(UpdateRestaurantRequestDto request) throws Exception;
}
