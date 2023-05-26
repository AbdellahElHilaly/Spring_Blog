package com.abdellah.blog.service;

import java.util.List;
import java.util.Optional;

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
  public Category save(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public Category update(Long id, Category category) {
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void deleteById(Long id) {
    categoryRepository.deleteById(id);
  }

  @Override
  public Optional<Category> findById(Long id) {
      return categoryRepository.findById(id);
  }



  
}
