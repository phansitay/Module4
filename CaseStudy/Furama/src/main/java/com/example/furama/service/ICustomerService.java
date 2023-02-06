package com.example.furama.service;

import com.example.furama.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> finAll();
    Customer finById(int id);
    void save(Customer customer);
    void delete(int id);
    List<Customer> search(String name);
}
