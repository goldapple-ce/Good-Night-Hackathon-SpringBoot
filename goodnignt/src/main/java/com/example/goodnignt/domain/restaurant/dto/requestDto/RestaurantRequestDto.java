package com.example.goodnignt.domain.restaurant.dto.requestDto;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequestDto {
    private String name;
    private String category;

    public Restaurant toEntity(){
        return Restaurant.builder()
                .name(name)
                .category(category)
                .build();
    }
}
