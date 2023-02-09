package com.example.baithi.service;

import com.example.baithi.model.Contract;
import com.example.baithi.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();
    Customer finById(int id);
    void save(Customer customer);
    void delete(int id);
    List<Customer> search(String name);
}
