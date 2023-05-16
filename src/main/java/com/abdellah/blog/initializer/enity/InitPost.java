package com.abdellah.blog.initializer.enity;

import com.abdellah.blog.model.Post;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import com.abdellah.blog.repository.PostRepository;

@Component
public class InitPost  {

  private final PostRepository postRepository;

  public InitPost(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void initializePosts() {

    if (postRepository.count() == 0) {
      Faker faker = Faker.instance();
      for (int i = 0; i < 30; i++) {
        Post tempPost = new Post(faker.book().title(), faker.lorem().paragraph());
        postRepository.save(tempPost);
      }
    }
  }

}




