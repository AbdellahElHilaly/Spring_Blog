package com.abdellah.blog.service.interfaces;



import com.abdellah.blog.model.Category;
import java.util.List;

public interface CategoryService {
  
  List<Category> all();

  Category Store(Category category);

  Category update(Long id, Category category);

  void delete(Long id);

  Category find(Long id);


}
