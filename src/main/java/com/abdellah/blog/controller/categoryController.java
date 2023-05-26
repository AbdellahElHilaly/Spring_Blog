package com.abdellah.blog.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.service.interfaces.CategoryService;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

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

// , @RequestParam("image") MultipartFile image
  @PostMapping
  public ResponseEntity<Category> store(Category category) {
    return ResponseEntity.ok(categoryService.save(category));
  }



}

