package com.example.goodnignt.domain.restaurant.domain.repository;

import com.example.goodnignt.domain.restaurant.domain.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    @Query(value = "select * from restaurant where category = :category and is_activated = true",nativeQuery = true)
    List<Restaurant> findAllByCategory(@Param("category")String category);

    @Override
    @Query(value = "select * from restaurant where is_activated=true",nativeQuery = true)
    List<Restaurant> findAll();


//    @Modifying(clearAutomatically = true)
//    @Query(value="update restaurant set is_activated=false where id= :id",nativeQuery = true)
//    void softDeleteById(@Param("id") Long id);
}
