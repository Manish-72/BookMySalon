package com.BookMySalon.service;


import javax.naming.AuthenticationException;

import com.BookMySalon.modal.Review;
import com.BookMySalon.payload.dto.SalonDTO;
import com.BookMySalon.payload.dto.UserDTO;
import com.BookMySalon.payload.request.CreateReviewRequest;

import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        UserDTO user,
                        SalonDTO salon);

    List<Review> getReviewsBySalonId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws Exception, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws Exception, AuthenticationException;

}
