package com.example.img.service;

import com.example.img.model.Image;

import java.util.List;

public interface IImageService {
    List<Image> findAll();
    void save(Image image);
    Image findById(int id);
    void delete(int id);
}
