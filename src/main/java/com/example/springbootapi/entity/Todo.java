package com.example.springbootapi.entity;

// import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Data
@Entity
public class Todo {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private Integer id;
      private String name;

      // getter setter
      public Integer getId() {
            return id;
      }
      
      public void setId(Integer id) {
            this.id = id;
      }

      public String getName() {
            return name;
      }
      
      public void setName(String name) {
            this.name = name;
      }

      public Todo(){}
}
