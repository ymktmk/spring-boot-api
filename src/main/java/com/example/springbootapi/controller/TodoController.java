package com.example.springbootapi.controller;

import com.example.springbootapi.entity.Todo;
import com.example.springbootapi.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TodoController {

      @Autowired
      private TodoRepository todoRepository;

      @PostMapping("/create")
      private ResponseEntity<Todo> create(@RequestParam String name) {
            Todo t = new Todo();
            t.setName(name);
            Todo result = todoRepository.save(t);
            return new ResponseEntity<Todo>(result, HttpStatus.CREATED);
      }

      @GetMapping(path="/all")
      public @ResponseBody Iterable<Todo> getAllTodos() {
            return todoRepository.findAll();
      }

}

// curl -X POST -H 'Content-Type: application/json' http://localhost:8080/api/create -d '{"name":"tomoki"}'