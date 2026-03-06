package com.BookMySalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMySalon.modal.Category;

import java.util.Set;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Set<Category> findBySalonId(Long id);
}
