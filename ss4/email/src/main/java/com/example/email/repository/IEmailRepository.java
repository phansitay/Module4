package com.example.email.repository;

import com.example.email.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmailRepository extends JpaRepository<Email,Integer> {
}
