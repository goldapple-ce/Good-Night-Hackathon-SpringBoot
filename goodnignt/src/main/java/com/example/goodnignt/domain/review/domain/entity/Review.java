package com.example.goodnignt.domain.review.domain.entity;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import com.example.goodnignt.domain.review.dto.request.UpdateReviewRequestDto;
import com.example.goodnignt.global.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@ToString
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

    public void update(UpdateReviewRequestDto request) {
        this.title = request.getTitle();
        this.content = request.getContent();
    }
}
