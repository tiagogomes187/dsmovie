package com.github.tiagogomes187.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tiagogomes187.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
