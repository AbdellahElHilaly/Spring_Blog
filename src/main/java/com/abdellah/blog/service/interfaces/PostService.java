package com.abdellah.blog.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.abdellah.blog.model.Post;
import org.springframework.validation.annotation.Validated;

@Validated
public interface PostService {
  

  List<Post> all();

  Post save(Post post);

  Post update(Long id, Post post);

  void delete(Post id);

  Optional<Post> findById(Long id);

}
