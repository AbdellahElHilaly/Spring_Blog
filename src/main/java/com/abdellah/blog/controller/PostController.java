package com.abdellah.blog.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdellah.blog.model.Post;
import com.abdellah.blog.service.interfaces.PostService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/blog/api/posts")
@AllArgsConstructor


public class PostController {

  private PostService postService;

  @GetMapping
  public ResponseEntity<List<Post>> index() {
    return ResponseEntity.ok(postService.all());
  }

  

}

