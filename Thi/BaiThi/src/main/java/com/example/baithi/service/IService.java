package com.example.baithi.service;

import com.example.baithi.model.Contract;
import com.example.baithi.model.Service;

import java.util.List;

public interface IService {
    List<Service> finAll();
    Service finById(int id);
    void save(Service service);
}
