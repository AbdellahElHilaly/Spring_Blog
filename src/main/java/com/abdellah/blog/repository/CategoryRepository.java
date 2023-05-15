package com.abdellah.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdellah.blog.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
  
}
