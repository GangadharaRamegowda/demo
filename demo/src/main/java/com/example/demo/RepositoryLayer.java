package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnClass(name = "com.example.demo.ResponseStatus")
public interface RepositoryLayer extends JpaRepository<com.example.demo.jpa.Employee, Integer> {
}
