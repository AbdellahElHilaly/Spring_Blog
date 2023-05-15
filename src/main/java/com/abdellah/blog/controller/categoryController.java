package com.abdellah.blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.abdellah.blog.model.Category;
import com.abdellah.blog.service.interfaces.CategoryService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/blog/api/categories")
@AllArgsConstructor

public class categoryController {

  private CategoryService categoryService;

  @GetMapping
  public ResponseEntity<List<Category>> index() {
    return ResponseEntity.ok(categoryService.all());
  }

}

