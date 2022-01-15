package br.com.alfasigmadigital.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alfasigmadigital.dsmovie.entities.Score;
import br.com.alfasigmadigital.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
