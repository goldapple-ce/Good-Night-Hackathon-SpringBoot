package com.example.goodnignt.domain.restaurant.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RestaurantResponseDto {
    private String name;
    private String category;
    private LocalDate createdAt;
}
