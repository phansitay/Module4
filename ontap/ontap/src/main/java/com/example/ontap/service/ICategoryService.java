package com.example.ontap.service;

import com.example.ontap.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> finAll();
    Category finById(int id);
}
