package com.example.nhac.service;

import com.example.nhac.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> finAll();
    void save(Music music);
    Music finById(int id);
    void delete(int id);
}
