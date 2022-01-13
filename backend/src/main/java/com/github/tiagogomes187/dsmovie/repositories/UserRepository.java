package com.github.tiagogomes187.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.tiagogomes187.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
