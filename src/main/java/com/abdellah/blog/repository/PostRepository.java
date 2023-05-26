package com.abdellah.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdellah.blog.model.Post;
import org.springframework.validation.annotation.Validated;

@Validated
public interface PostRepository extends JpaRepository<Post, Long> {
  // is it important to implement this interface? -> no, it's already implemented in the spring framework
}

// how to change the package name in vs code? -< ctrl + shift + p -> java: change package name