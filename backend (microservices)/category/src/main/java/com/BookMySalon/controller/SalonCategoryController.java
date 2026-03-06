package com.BookMySalon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.BookMySalon.modal.Category;
import com.BookMySalon.payload.dto.SalonDTO;
import com.BookMySalon.payload.dto.UserDTO;
import com.BookMySalon.service.CategoryService;
import com.BookMySalon.service.clients.SalonFeignClient;
import com.BookMySalon.service.clients.UserFeignClient;

@RestController
@RequestMapping("/api/categories/salon-owner")
@RequiredArgsConstructor
public class SalonCategoryController {

    private final CategoryService categoryService;
    private final SalonFeignClient salonService;


    @PostMapping
    public ResponseEntity<Category> createCategory(
            @RequestBody Category category,
            @RequestHeader("Authorization") String jwt) throws Exception {
        SalonDTO salon=salonService.getSalonByOwner(jwt).getBody();

        Category savedCategory = categoryService.saveCategory(category, salon);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }
}
