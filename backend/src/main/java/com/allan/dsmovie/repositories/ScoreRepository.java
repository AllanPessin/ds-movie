package com.allan.dsmovie.repositories;

import com.allan.dsmovie.entities.Score;
import com.allan.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
  
}
