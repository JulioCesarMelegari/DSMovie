package com.JCM.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCM.movies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
