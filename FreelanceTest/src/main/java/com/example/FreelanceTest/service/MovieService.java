package com.example.FreelanceTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.FreelanceTest.modal.Movie;

@Service
public class MovieService {

  private List<Movie> movieList = new ArrayList<>();

  public Movie addMovie(Movie movie){
    movieList.add(movie);
    return movie;
  }
  
  public Movie getMovieById(int id){
    for(Movie movie : movieList){
      if(movie.getId() == id){
        return movie;
      }
    }
    return null;
  }

}
