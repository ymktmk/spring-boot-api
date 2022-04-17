package com.example.springbootapi.controller;

import com.example.springbootapi.entity.Todo;
import com.example.springbootapi.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// import antlr.collections.List;

@RestController
@RequestMapping(value = "/api")
public class TodoController {

      @Autowired
      TodoRepository todoRepository;

      // Request Body
      @PostMapping(value = "/post")
      private String post(@RequestBody String body) {
            // {"name":"tomoki"}
            return body;
            // return new ResponseEntity<Todo> (todo, HttpStatus.CREATED);
      }

      // POST DB
      @PostMapping(value = "/create")
      private void create(@RequestBody Todo todo) {
            todoRepository.save(todo);
            // return result;
      }

      @GetMapping(value = "/todos")
      public List<Todo> getAllTodos() {
            return todoRepository.findAll();
      }

}