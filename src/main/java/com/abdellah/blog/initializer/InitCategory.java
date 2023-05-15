package com.abdellah.blog.initializer;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // for spring to know that this class is a component and run it automatically when the application starts
public class InitCategory implements CommandLineRunner { // CommandLineRunner is an interface that allows us to run some code after the application starts

    private final CategoryRepository categoryRepository; 

    public InitCategory(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        initializeCategories();
    }

    private void initializeCategories() {
        if (categoryRepository.count() == 0) {
          Category category1 = new Category("Java");
          Category category2 = new Category("Spring");
          Category category3 = new Category("Spring Boot");

            categoryRepository.save(category1);
            categoryRepository.save(category2);
            categoryRepository.save(category3);
        }
    }
}
