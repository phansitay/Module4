package com.example.baithi.service;

import com.example.baithi.model.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> finAll();
    Contract finById(int id);
    void save(Contract contract);
    void delete(int id);
    List<Contract> search(String name);
}
