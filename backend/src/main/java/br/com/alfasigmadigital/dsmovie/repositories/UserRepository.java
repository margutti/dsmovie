package br.com.alfasigmadigital.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alfasigmadigital.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
