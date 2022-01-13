package com.github.tiagogomes187.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tiagogomes187.dsmovie.entities.Score;
import com.github.tiagogomes187.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
