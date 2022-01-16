package com.allan.dsmovie.repositories;

import com.allan.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
  
}
