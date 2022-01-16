package com.JCM.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCM.movies.entities.Score;
import com.JCM.movies.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
