package com.example.goodnignt.domain.restaurant.controller;

import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping
    public Long createRestaurant(@RequestBody RestaurantRequestDto restaurantRequestDto) throws Exception {
        return restaurantService.createRestaurant(restaurantRequestDto);
    }

    @GetMapping("/{id}")
    public RestaurantResponseDto getRestaurantInfo(@PathVariable("id") Long id) throws Exception{
        return restaurantService.getRestaurantInfo(id);
    }

    @GetMapping
    public List<RestaurantResponseDto> getAllRestaurantInfo(@RequestParam(value = "category",required = false) String category) throws Exception{
        if (category != null){
            return restaurantService.getAllRestaurantInfo(category);
        }
        return restaurantService.getAllRestaurantInfo();
    }
}
