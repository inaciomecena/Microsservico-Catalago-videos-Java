package com.fullcycle.FCCatalogo.application.service;

import java.util.Optional;
import java.util.UUID;

import com.fullcycle.FCCatalogo.application.dto.CategoryDTO;
import com.fullcycle.FCCatalogo.domain.entity.Category;
import com.fullcycle.FCCatalogo.domain.repository.ICategoryRepository;

import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private ICategoryRepository categoryRepository;

    public CategoryServiceImpl(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Iterable<Category> findAll() {
        return this.categoryRepository.findAllCategories();
    }

    @Override
    public Optional<Category> findById(UUID id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Category create(CategoryDTO toAdd) {
        return this.categoryRepository.create(toAdd.toEntity());
    }
    
}
