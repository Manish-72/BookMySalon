package com.BookMySalon.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.BookMySalon.domain.PaymentMethod;
import com.BookMySalon.exception.UserException;
import com.BookMySalon.payload.response.PaymentLinkResponse;

@FeignClient("PAYMENT")
public interface PaymentFeignClient {

    @PostMapping("/create")
    public ResponseEntity<PaymentLinkResponse> createPaymentLink(
            @RequestHeader("Authorization") String jwt,
            @RequestParam Long bookingId,
            @RequestParam PaymentMethod paymentMethod) throws UserException;
}
