package com.BookMySalon.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.BookMySalon.modal.Category;
import com.BookMySalon.payload.dto.SalonDTO;
import com.BookMySalon.repository.CategoryRepository;
import com.BookMySalon.service.CategoryService;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category, SalonDTO salon) {

        Category newCategory=new Category();
        newCategory.setName(category.getName());
        newCategory.setImage(category.getImage());
        newCategory.setSalonId(salon.getId());


        return categoryRepository.save(newCategory);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Set<Category> getAllCategoriesBySalon(Long salonId) {
        return categoryRepository.findBySalonId(salonId);
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        return categoryRepository.findById(id)
                .orElseThrow(()->new Exception("category not found"));
    }

    @Override
    public Category updateCategory(Long id,Category category) throws Exception {
        Category existingCategory=getCategoryById(id);

        if(category.getName()!=null){
            existingCategory.setName(category.getName());
        }
        if(category.getImage()!=null){
            existingCategory.setImage(category.getImage());
        }

        return categoryRepository.save(existingCategory);
    }

    @Override
    public void deleteCategory(Long id) throws Exception {
        getCategoryById(id);
        categoryRepository.deleteById(id);


    }
}
