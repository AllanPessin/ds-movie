package com.allan.dsmovie.controllers;

import com.allan.dsmovie.dto.MovieDTO;
import com.allan.dsmovie.dto.ScoreDTO;
import com.allan.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/score")
public class ScoreController {
  @Autowired
  private ScoreService service;
  @PutMapping(value = "/{id}")
  public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
    MovieDTO movieDTO = service.saveScore(dto);
    return movieDTO;
  }
}
