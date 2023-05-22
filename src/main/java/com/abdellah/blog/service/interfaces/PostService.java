package com.abdellah.blog.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.abdellah.blog.model.Post;


public interface PostService {
  

  List<Post> all();

  Post store(Post post);

  Post update(Long id, Post post);

  void delete(Post id);

  Optional<Post> findById(Long id);

}
