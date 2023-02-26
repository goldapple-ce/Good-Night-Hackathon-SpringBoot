package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.restaurant.domain.repository.RestaurantRepository;
import com.example.goodnignt.domain.restaurant.dto.requestDto.CreateRestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.GetRestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.dto.requestDto.UpdateRestaurantRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Long createRestaurant(CreateRestaurantRequestDto request) throws Exception {
        Restaurant restaurant = request.toEntity();
        return restaurantRepository.save(restaurant).getId();
    }

    @Override
    public GetRestaurantResponseDto getRestaurantInfo(Long id) throws Exception {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(null);
        return restaurant.toResponseDto();
    }

    @Override
    public List<GetRestaurantResponseDto> getAllRestaurantInfo() throws Exception {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants.stream().map(Restaurant::toResponseDto).collect(Collectors.toList());
    }

    @Override
    public List<GetRestaurantResponseDto> getAllRestaurantInfo(String category) throws Exception {
        List<Restaurant> restaurants = restaurantRepository.findAllByCategory(category);
        return restaurants.stream().map(Restaurant::toResponseDto).collect(Collectors.toList());
    }

    @Override
    public void deleteRestaurant(Long id) throws Exception {
        Restaurant restaurant = restaurantRepository.findById(id).orElseThrow(null);
        restaurant.deleteRestaurant();
        restaurantRepository.save(restaurant);
    }

    @Override
    public void updatedRestaurant(UpdateRestaurantRequestDto request) throws Exception {
        Restaurant restaurant = restaurantRepository.findById(request.getId()).orElseThrow(null);
        restaurant.updateCategory(request.getCategory());
        restaurantRepository.save(restaurant);
    }

}