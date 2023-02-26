package com.example.goodnignt.domain.restaurant.controller;

import com.example.goodnignt.domain.restaurant.dto.requestDto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.dto.requestDto.UpdateRestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.service.RestaurantService;
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

    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable("id") Long id) throws Exception{
        restaurantService.deleteRestaurant(id);
    }

    @PutMapping
    public void updateCategory(@RequestBody UpdateRestaurantRequestDto request) throws Exception{
        restaurantService.updatedRestaurant(request);
    }
}
