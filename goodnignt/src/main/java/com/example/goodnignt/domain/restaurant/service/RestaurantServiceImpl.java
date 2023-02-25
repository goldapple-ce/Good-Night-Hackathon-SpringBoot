package com.example.goodnignt.domain.restaurant.service;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.restaurant.domain.repository.RestaurantRepository;
import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Long createRestaurant(RestaurantRequestDto request) throws Exception {
        Restaurant restaurant = request.toEntity();
        return restaurantRepository.save(restaurant).getId();
    }

    @Override
    public RestaurantResponseDto getRestaurantInfo(Long id) throws Exception {
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        return restaurant.get().toResponseDto();
    }

}
