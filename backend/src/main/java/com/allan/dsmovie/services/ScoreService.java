package com.allan.dsmovie.services;

import com.allan.dsmovie.dto.MovieDTO;
import com.allan.dsmovie.dto.ScoreDTO;
import com.allan.dsmovie.entities.Movie;
import com.allan.dsmovie.entities.Score;
import com.allan.dsmovie.entities.User;
import com.allan.dsmovie.repositories.MovieRepository;
import com.allan.dsmovie.repositories.ScoreRepository;
import com.allan.dsmovie.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {
  @Autowired
  private MovieRepository movieRepository;
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ScoreRepository scoreRepository;

  @Transactional
  public MovieDTO saveScore(ScoreDTO dto) {
    User user = userRepository.findByEmail(dto.getEmail());
    if (user == null) {
      user = new User();
      user.setEmail(dto.getEmail());
      user = userRepository.saveAndFlush(user);
    }

    Movie movie = movieRepository.findById(dto.getMovieId()).get();
    Score score = new Score();
    score.setMovie(movie);
    score.setUser(user);
    score.setValue(dto.getScore());
    score = scoreRepository.saveAndFlush(score);

    double sum = 0.0;
    for (Score scories : movie.getScores()) {
      sum = sum + scories.getValue();
    }

    double avg = sum / movie.getScores().size();

    movie.setScore(avg);
    movie.setCount(movie.getScores().size());
    movie = movieRepository.save(movie);

    return new MovieDTO(movie);
  }
}