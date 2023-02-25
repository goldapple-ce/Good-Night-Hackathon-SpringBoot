package com.example.goodnignt;

import com.example.goodnignt.domain.restaurant.dto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class GoodnigntApplicationTests {

	@Autowired
	private RestaurantService restaurantService;

	@Test
	void createRestaurant() throws Exception {
		RestaurantRequestDto response = new RestaurantRequestDto("레스토랑","한식");
		Long id = restaurantService.createRestaurant(response);
		System.out.println(id);
		RestaurantResponseDto responseDto = restaurantService.getRestaurantInfo(id);
		System.out.println(responseDto.toString());
	}

}
