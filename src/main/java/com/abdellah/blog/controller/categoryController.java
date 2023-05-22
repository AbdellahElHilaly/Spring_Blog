package com.abdellah.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.service.interfaces.CategoryService;

import java.util.List;

import lombok.AllArgsConstructor;

@RestController // @RestController = @Controller + @ResponseBody, for returning JSON objects directly, without using a view resolver
@RequestMapping("/blog/api/categories")
@AllArgsConstructor

public class categoryController {

  private CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> index() {
    return ResponseEntity.ok(categoryService.all());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Category> show(@PathVariable Long id) {
    return categoryService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Category> delete(@PathVariable Long id) {
    categoryService.deleteById(id);
    return ResponseEntity.noContent().build();
  }

}

