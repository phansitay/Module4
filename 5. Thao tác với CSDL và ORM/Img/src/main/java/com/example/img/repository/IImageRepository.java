package com.example.img.repository;

import com.example.img.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageRepository extends JpaRepository<Image,Integer> {
}
