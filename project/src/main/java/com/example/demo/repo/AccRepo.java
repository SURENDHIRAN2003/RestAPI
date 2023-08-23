package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AccEntity;

public interface AccRepo extends JpaRepository<AccEntity, Integer> {

}