package com.abdellah.blog.service.interfaces;

import com.abdellah.blog.model.Post;
import java.util.List;


public interface PostService {
  

  List<Post> all();

  Post Store(Post post);

  Post update(Long id, Post post);

  void delete(Long id);

  Post find(Long id);

}
