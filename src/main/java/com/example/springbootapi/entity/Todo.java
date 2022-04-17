package com.example.springbootapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// 各フィールドのsetterとgetterを定義してくれる
@Data
@Entity
@Table(name = "todo")
public class Todo {
      @Id
      // AUTO
      @GeneratedValue(strategy=GenerationType.IDENTITY)
      private Integer id;
      private String name;
      public Todo(){}
}
