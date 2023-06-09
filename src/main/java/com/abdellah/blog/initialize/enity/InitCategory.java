package com.abdellah.blog.initialize.enity;

import org.springframework.stereotype.Component;
import com.github.javafaker.Faker;
import com.abdellah.blog.model.Category;
import com.abdellah.blog.repository.CategoryRepository;

@Component
public class InitCategory {
  
  private final CategoryRepository categoryRepository;

  public InitCategory(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  public void initializeCategories() {
    if (categoryRepository.count() == 0) {
      Faker faker = Faker.instance();
      for (int i = 0; i < 10; i++) {
        Category tempCategory = new Category(faker.book().genre());
        categoryRepository.save(tempCategory);
      }
    }
  }
}
