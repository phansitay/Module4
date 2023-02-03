package com.example.ontap.service;

import com.example.ontap.model.Category;
import com.example.ontap.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> finAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category finById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
