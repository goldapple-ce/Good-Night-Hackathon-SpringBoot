package com.example.goodnignt.domain.restaurant.dto.responseDto;

import lombok.*;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class GetRestaurantResponseDto {
    private String name;
    private String category;
    private LocalDate createdAt;
}
