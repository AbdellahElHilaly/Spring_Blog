package com.abdellah.blog.initializer.relationship;

import com.abdellah.blog.model.Category;
import com.abdellah.blog.model.Post;
import com.abdellah.blog.repository.CategoryRepository;
import com.abdellah.blog.repository.PostRepository;
import org.springframework.stereotype.Component;

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
        List<Category> categories = categoryRepository.findAll();
        List<Post> posts = postRepository.findAll();
        Random random = new Random();

        for (Post post : posts) {
          int randomIndex = random.nextInt(categories.size());
          Category randomCategory = categories.get(randomIndex);
          post.setCategory(randomCategory); // what is setCategory() method?-> it is a setter method for the category field in the Post class
          // who add this method to the Post class? -> the Lombok library by the @Data annotation
          postRepository.save(post);
        }
    }
}
