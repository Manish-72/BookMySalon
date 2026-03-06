package com.BookMySalon.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookMySalon.payload.response.ApiResponse;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<ApiResponse> HomeControllerHandler() {
        
        return ResponseEntity.status(
                        HttpStatus.OK)
                .body(new ApiResponse(

                        "welcome to salon booking system, service offering api"


                ));
    }
}
