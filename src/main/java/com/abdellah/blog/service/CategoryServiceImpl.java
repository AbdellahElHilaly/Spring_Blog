package com.abdellah.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.repository.CategoryRepository;
import com.abdellah.blog.service.interfaces.CategoryService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class CategoryServiceImpl implements CategoryService {

  private CategoryRepository categoryRepository;
  
  @Override
  public List<Category> all() {
    return categoryRepository.findAll().stream().toList();
  }

  @Override
  public Category Store(Category category) {
    throw new UnsupportedOperationException("Unimplemented method 'Store'");
  }

  @Override
  public Category update(Long id, Category category) {
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Category find(Long id) {
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }
  
}
