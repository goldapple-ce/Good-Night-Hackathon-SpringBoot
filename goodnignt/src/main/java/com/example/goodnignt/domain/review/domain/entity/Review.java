package com.example.goodnignt.domain.review.domain.entity;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.global.entity.BaseEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Restaurant.class, fetch = FetchType.LAZY)
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;

    @Column
    private String title;

    @Column
    private String content;

    @Builder
    public Review(Restaurant restaurant,String title,String content){
        this.restaurant = restaurant;
        this.title = title;
        this.content = content;
    }
}
