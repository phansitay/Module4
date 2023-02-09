package com.example.baithi.service;

import com.example.baithi.model.Contract;
import com.example.baithi.repository.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService{
    @Autowired
    private IContractRepository contractRepository;
    @Override
    public List<Contract> finAll() {
        return contractRepository.findAll();
    }

    @Override
    public Contract finById(int id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public List<Contract> search(String name) {
        return contractRepository.findAllByName(name);
    }
}
