package com.example.img.service;

import com.example.img.model.Image;

import java.util.List;

public interface IImageService {
    List<Image> findAll();
    void sava(Image image);
    Image findById(int id);
}
