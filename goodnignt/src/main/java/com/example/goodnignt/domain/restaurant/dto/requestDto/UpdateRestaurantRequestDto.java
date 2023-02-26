package com.example.goodnignt.domain.restaurant.dto.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRestaurantRequestDto {
    private Long id;
    private String category;
}
