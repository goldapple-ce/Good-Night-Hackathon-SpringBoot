package com.example.goodnignt.domain.restaurant.domain.entity;


import com.example.goodnignt.domain.restaurant.dto.responseDto.GetRestaurantResponseDto;
import com.example.goodnignt.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="restaurant")
public class Restaurant extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private boolean isActivated;

    @Builder
    public Restaurant(String name,String category) {
        this.name = name;
        this.category = category;
        this.isActivated = true;
    }

    public void deleteRestaurant(){
        this.isActivated = false;
    }

    public void updateCategory(String category){
        this.category = category;
    }

    public GetRestaurantResponseDto toResponseDto(){
        return GetRestaurantResponseDto.builder().name(name).category(category).createdAt(super.getCreatedAt()).build();
    }
}
