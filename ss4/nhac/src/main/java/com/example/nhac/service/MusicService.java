package com.example.nhac.service;

import com.example.nhac.model.Music;
import com.example.nhac.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements IMusicService{
    @Autowired
    private IMusicRepository musicRepository;
    @Override
    public List<Music> finAll() {
        return musicRepository.findAll();
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public Music finById(int id) {
        return musicRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        musicRepository.deleteById(id);
    }
}
