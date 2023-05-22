package com.abdellah.blog.service.interfaces;



import java.util.List;
import java.util.Optional;

import com.abdellah.blog.model.Category;

public interface CategoryService {
  
  List<Category> all();

  Category Store(Category category);

  Category update(Long id, Category category);

  void deleteById(Long id);

  Optional<Category> findById(Long id);



}
