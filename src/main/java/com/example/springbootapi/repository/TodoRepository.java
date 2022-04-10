package com.example.springbootapi.repository;

import com.example.springbootapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
      
}
