package com.abdellah.blog.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdellah.blog.model.Post;
import com.abdellah.blog.service.interfaces.PostService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/blog/api/posts")
@AllArgsConstructor
@ControllerAdvice

public class PostController {

  private PostService postService;

  @GetMapping
  public ResponseEntity<List<Post>> index() {
    return ResponseEntity.ok(postService.all());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Post> show(@PathVariable Long id) {
    return postService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Post> delete(@PathVariable Long id) {
    Post post = postService.findById(id).orElseThrow(NoSuchElementException::new);
    postService.delete(post);
    return ResponseEntity.noContent().build();
  }

  @PostMapping
  public Post store(@RequestBody Post post) {
    // return ResponseEntity.ok(postService.store(post));
    return post;
  }


}





