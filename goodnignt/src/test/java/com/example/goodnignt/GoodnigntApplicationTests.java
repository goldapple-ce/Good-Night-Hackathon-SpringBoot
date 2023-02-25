package com.example.goodnignt;

import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class GoodnigntApplicationTests {

	@Autowired
	private RestaurantService restaurantService;

	@Test
	void createAndGetRestaurant() throws Exception {
		RestaurantRequestDto response = new RestaurantRequestDto("레스토랑","한식");
		Long id = restaurantService.createRestaurant(response);
		RestaurantResponseDto responseDto = restaurantService.getRestaurantInfo(id);
	}

	@Test
	void getAllRestaurant() throws Exception{
		List<RestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo();
	}

	@Test
	void getAllRestaurantByCategory() throws Exception{
		List<RestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo("한식");
	}

}
