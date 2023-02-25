package com.example.goodnignt.domain.restaurant.domain.repository;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
