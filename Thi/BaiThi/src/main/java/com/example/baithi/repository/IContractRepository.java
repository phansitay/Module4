package com.example.baithi.repository;

import com.example.baithi.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContractRepository extends JpaRepository<Contract,Integer> {

    @Query(value = "select s from contract as s where s.customer.name like %:name%",nativeQuery = false)
    List<Contract> findAllByName(@Param("name") String name);
}
