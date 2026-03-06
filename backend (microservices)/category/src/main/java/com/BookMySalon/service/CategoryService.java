package com.BookMySalon.service;

import java.util.List;
import java.util.Set;

import com.BookMySalon.modal.Category;
import com.BookMySalon.payload.dto.SalonDTO;

public interface CategoryService {

    // Create or Update a Category
    Category saveCategory(Category category, SalonDTO salon);

    // Get all Categories
    List<Category> getAllCategories();

    Set<Category> getAllCategoriesBySalon(Long id);

    // Get Category by ID
    Category getCategoryById(Long id) throws Exception;

    Category updateCategory(Long id,Category category) throws Exception;

    // Delete Category by ID
    void deleteCategory(Long id) throws Exception;
}
