package com.abdellah.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdellah.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
  // is it important to implement this interface? -> no, it's already implemented in the spring framework
}
