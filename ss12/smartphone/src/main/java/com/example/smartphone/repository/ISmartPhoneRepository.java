package com.example.smartphone.repository;

import com.example.smartphone.model.SmartPhone;
import org.springframework.data.repository.CrudRepository;

public interface ISmartPhoneRepository extends CrudRepository<SmartPhone,Long> {

}
