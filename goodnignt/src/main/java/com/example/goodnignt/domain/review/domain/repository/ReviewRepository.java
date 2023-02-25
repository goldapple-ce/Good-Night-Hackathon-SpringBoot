package com.example.goodnignt.domain.review.domain.repository;

import com.example.goodnignt.domain.review.domain.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
