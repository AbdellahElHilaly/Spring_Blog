package com.abdellah.blog.controller;

import java.util.List;
import java.util.NoSuchElementException;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.abdellah.blog.model.Post;
import com.abdellah.blog.service.interfaces.PostService;

import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;


@RequestMapping("/blog/api/posts") @RestController @AllArgsConstructor @ControllerAdvice @Validated

public class PostController {

  private PostService postService;

  @GetMapping
  public ResponseEntity<List<Post>> index() {
    return ResponseEntity.ok(postService.all());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Post> show(@PathVariable @Min(value = 80) Long id) {
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
  public ResponseEntity<Post> store(@Valid Post post) {
    return ResponseEntity.ok(postService.save(post));
  }



}

/*

 */








