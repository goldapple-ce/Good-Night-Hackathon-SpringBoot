package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.dto.requestDto.CreateRestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.GetRestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.dto.requestDto.UpdateRestaurantRequestDto;

import java.util.List;


public interface RestaurantService {
    public Long createRestaurant(CreateRestaurantRequestDto request) throws Exception;
    public GetRestaurantResponseDto getRestaurantInfo(Long id) throws Exception;
    public List<GetRestaurantResponseDto> getAllRestaurantInfo() throws Exception;
    public List<GetRestaurantResponseDto> getAllRestaurantInfo(String category) throws Exception;

    public void deleteRestaurant(Long id) throws Exception;
    public void updatedRestaurant(UpdateRestaurantRequestDto request) throws Exception;
}
