package com.abdellah.blog.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;


@Data @Validated @Entity

@Table(name = "posts")
@NoArgsConstructor
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private String content;
  
  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  public Post(String title, String content) {
    this.title = title;
    this.content = content;
  }


}



