package com.example.baithi.service;

import com.example.baithi.model.Service;
import com.example.baithi.repository.IServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceService implements IService{
    @Autowired
    private IServiceRepository serviceRepository;
    @Override
    public List<Service> finAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Service finById(int id) {
        return null;
    }

    @Override
    public void save(Service service) {

    }
}
