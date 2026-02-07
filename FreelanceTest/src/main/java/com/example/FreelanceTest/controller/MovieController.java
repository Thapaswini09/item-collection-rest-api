package com.example.FreelanceTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FreelanceTest.modal.Movie;
import com.example.FreelanceTest.service.MovieService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/movies")
public class MovieController {
  
  @Autowired
  private MovieService movieservice;

  @PostMapping
  public Movie addMovie(@Valid @RequestBody Movie movie){
    return movieservice.addMovie(movie);
  }

  @GetMapping("/{id}")
  public Movie getMovie(@PathVariable int id){
    return movieservice.getMovieById(id);
  }
}
