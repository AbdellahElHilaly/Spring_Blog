package com.abdellah.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogApplication {

  public static void main(String[] args) {
    SpringApplication.run(BlogApplication.class, args);
  }
}

/*

task of spring boot project:
1-entity (model + validation )
2-repository
3-service
4-controller (rest api + dto)
5-exception
6-configuration (cors + security)
7-security

!! dto in spring boot  = api resource in laravel

*/


// convert this cmd to mvn : java -jar target/docker-message-server-1.0.0.jar-> mvn spring-boot:run