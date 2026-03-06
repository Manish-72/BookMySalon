package com.BookMySalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMySalon.modal.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findReviewsByUserId(Long userId);
    List<Review> findReviewsBySalonId(Long productId);
}
