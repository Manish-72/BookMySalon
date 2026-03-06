package com.BookMySalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMySalon.modal.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
