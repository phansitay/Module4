package com.example.furama.repository;

import com.example.furama.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select s from Customer as s where s.customerName like %:name%",nativeQuery = false)
    List<Customer> findAllByName(@Param("name") String name);
}
