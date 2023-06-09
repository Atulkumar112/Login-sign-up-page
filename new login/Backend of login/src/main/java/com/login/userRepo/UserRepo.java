package com.login.userRepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.login.user.User;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User> findOneByEmailAndPassword(String userEmail, String password);
	 
	
    User findByEmail(String email);
}
