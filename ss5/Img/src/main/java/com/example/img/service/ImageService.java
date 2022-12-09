package com.example.img.service;

import com.example.img.model.Image;
import com.example.img.repository.IImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ImageService")
public class ImageService implements IImageService{
    @Autowired
    private IImageRepository imageRepository;
    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public void save(Image image) {
        imageRepository.save(image);
    }

    @Override
    public Image findById(int id) {
        return imageRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        imageRepository.deleteById(id);
    }
}
