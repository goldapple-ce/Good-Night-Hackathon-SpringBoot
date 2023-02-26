package com.example.goodnignt;

import com.example.goodnignt.domain.restaurant.dto.requestDto.RestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.RestaurantResponseDto;
import com.example.goodnignt.domain.restaurant.dto.requestDto.UpdateRestaurantRequestDto;
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
	static RestaurantRequestDto response;
	static RestaurantRequestDto response2;
	static RestaurantRequestDto response3;
	static RestaurantRequestDto response4;

	@Test
	void createAndGetRestaurant() throws Exception {
		System.out.println();
		System.out.println("start createAndGetRestaurant method");
		response = new RestaurantRequestDto("test_name", "test_category");
		response2 = new RestaurantRequestDto("test_name2","test_category");
		response3 = new RestaurantRequestDto("test_name3","test_category2");
		response4 = new RestaurantRequestDto("test_name4","test_category2");
		Long id = restaurantService.createRestaurant(response);
		restaurantService.createRestaurant(response2);
		restaurantService.createRestaurant(response3);
		restaurantService.createRestaurant(response4);

		RestaurantResponseDto responseDto = restaurantService.getRestaurantInfo(id);
		System.out.println(responseDto.toString());
	}

	@Test
	void getAllRestaurant() throws Exception{
		System.out.println();
		System.out.println("start getAllRestaurant method");
		List<RestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo();
		for(RestaurantResponseDto restaurantResponseDto : restaurantResponseDtos){
			System.out.println(restaurantResponseDto);
		}
	}

	@Test
	void getAllRestaurantByCategory() throws Exception{
		System.out.println();
		System.out.println("start getAllRestaurantByCategory method");
		List<RestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo("test_category2");
		for(RestaurantResponseDto restaurantResponseDto : restaurantResponseDtos){
			System.out.println(restaurantResponseDto);
		}
	}

	@Test
	void deleteRestaurant() throws Exception{
		System.out.println();
		System.out.println("start deleteRestaurant method");
		restaurantService.deleteRestaurant(1L);
		getAllRestaurant();
	}

	@Test
	void updateCategory() throws Exception{
		System.out.println();
		System.out.println("start updateCategory method");
		UpdateRestaurantRequestDto request = new UpdateRestaurantRequestDto(1L,"category2");
		restaurantService.updatedRestaurant(request);
		getAllRestaurant();
	}

}
