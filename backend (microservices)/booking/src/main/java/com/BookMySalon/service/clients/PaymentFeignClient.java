package com.BookMySalon.service.clients;

import com.BookMySalon.domain.PaymentMethod;
import com.BookMySalon.exception.UserException;
import com.BookMySalon.modal.Booking;
import com.BookMySalon.payload.dto.BookingDTO;
import com.BookMySalon.payload.response.PaymentLinkResponse;
import com.razorpay.RazorpayException;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("payment")
public interface PaymentFeignClient {

    @PostMapping("/api/payments/create")
    public ResponseEntity<PaymentLinkResponse> createPaymentLink(
            @RequestHeader("Authorization") String jwt,
            @RequestBody Booking booking,
            @RequestParam PaymentMethod paymentMethod) throws UserException,
            RazorpayException;
}
