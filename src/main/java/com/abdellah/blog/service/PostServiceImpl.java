package com.abdellah.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abdellah.blog.model.Post;
import com.abdellah.blog.repository.PostRepository;
import com.abdellah.blog.service.interfaces.PostService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

  private PostRepository postRepository;
  @Override
  public List<Post> all() {
    return postRepository.findAll().stream().toList();
  }

  @Override
  public Post Store(Post post) {
    throw new UnsupportedOperationException("Unimplemented method 'Store'");
  }

  @Override
  public Post update(Long id, Post post) {
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Post find(Long id) {
    throw new UnsupportedOperationException("Unimplemented method 'find'");
  }
  
}
