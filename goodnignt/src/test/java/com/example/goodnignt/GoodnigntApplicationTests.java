package com.example.goodnignt;

import com.example.goodnignt.domain.restaurant.dto.requestDto.CreateRestaurantRequestDto;
import com.example.goodnignt.domain.restaurant.dto.responseDto.GetRestaurantResponseDto;
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
	static CreateRestaurantRequestDto response;
	static CreateRestaurantRequestDto response2;
	static CreateRestaurantRequestDto response3;
	static CreateRestaurantRequestDto response4;

	@Test
	void createAndGetRestaurant() throws Exception {
		System.out.println();
		System.out.println("start createAndGetRestaurant method");
		response = new CreateRestaurantRequestDto("test_name", "test_category");
		response2 = new CreateRestaurantRequestDto("test_name2","test_category");
		response3 = new CreateRestaurantRequestDto("test_name3","test_category2");
		response4 = new CreateRestaurantRequestDto("test_name4","test_category2");
		Long id = restaurantService.createRestaurant(response);
		restaurantService.createRestaurant(response2);
		restaurantService.createRestaurant(response3);
		restaurantService.createRestaurant(response4);

		GetRestaurantResponseDto responseDto = restaurantService.getRestaurantInfo(id);
		System.out.println(responseDto.toString());
	}

	@Test
	void getAllRestaurant() throws Exception{
		System.out.println();
		System.out.println("start getAllRestaurant method");
		List<GetRestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo();
		for(GetRestaurantResponseDto restaurantResponseDto : restaurantResponseDtos){
			System.out.println(restaurantResponseDto);
		}
	}

	@Test
	void getAllRestaurantByCategory() throws Exception{
		System.out.println();
		System.out.println("start getAllRestaurantByCategory method");
		List<GetRestaurantResponseDto> restaurantResponseDtos = restaurantService.getAllRestaurantInfo("test_category2");
		for(GetRestaurantResponseDto restaurantResponseDto : restaurantResponseDtos){
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
