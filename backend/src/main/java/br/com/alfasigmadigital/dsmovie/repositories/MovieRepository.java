package br.com.alfasigmadigital.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alfasigmadigital.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
