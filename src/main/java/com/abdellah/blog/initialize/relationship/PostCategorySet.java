package com.abdellah.blog.initialize.relationship;

import org.springframework.stereotype.Component;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.model.Post;
import com.abdellah.blog.repository.CategoryRepository;
import com.abdellah.blog.repository.PostRepository;

import java.util.List;
import java.util.Random;

@Component
public class PostCategorySet {

    private final CategoryRepository categoryRepository;
    private final PostRepository postRepository;

    public PostCategorySet(CategoryRepository categoryRepository, PostRepository postRepository) {
        this.categoryRepository = categoryRepository;
        this.postRepository = postRepository;
    }

    public void setCategoriesForPosts() {
      List<Post> posts = postRepository.findAll();

      if (posts.get(0).getCategory() != null) return;

      List<Category> categories = categoryRepository.findAll();
      Random random = new Random();

      for (Post post : posts) {
        int randomIndex = random.nextInt(categories.size());
        Category randomCategory = categories.get(randomIndex);
        post.setCategory(randomCategory); //@Data lombok :)
        postRepository.save(post);
      }
    }
}
