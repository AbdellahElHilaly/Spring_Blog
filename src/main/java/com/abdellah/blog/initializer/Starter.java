package com.abdellah.blog.initializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.abdellah.blog.initializer.enity.InitCategory;
import com.abdellah.blog.initializer.enity.InitPost;
import com.abdellah.blog.initializer.relationship.PostCategorySet;

@Component
@ComponentScan("com.abdellah.blog.initializer.enity") // Add the package containing InitPost
public class Starter implements CommandLineRunner {

  private final InitCategory initCategory;
  private final InitPost initPost;
  private final PostCategorySet postCategorySet;

  public Starter(InitCategory initCategory, InitPost initPost, PostCategorySet postCategorySet) {
    this.initCategory = initCategory;
    this.initPost = initPost;
    this.postCategorySet = postCategorySet;
  }

  @Override
  public void run(String... args) throws Exception {
    initCategory.initializeCategories();
    initPost.initializePosts();
    postCategorySet.setCategoriesForPosts();
  }
}
