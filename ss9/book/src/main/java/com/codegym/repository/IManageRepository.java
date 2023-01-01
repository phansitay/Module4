package com.codegym.repository;

import com.codegym.model.Book;
import com.codegym.model.Manage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManageRepository extends JpaRepository<Manage,Integer> {
}
