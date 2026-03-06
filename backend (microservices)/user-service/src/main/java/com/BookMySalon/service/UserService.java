package com.BookMySalon.service;


import java.util.List;

import com.BookMySalon.exception.UserException;
import com.BookMySalon.modal.User;


public interface UserService {
	User getUserByEmail(String email) throws UserException;
	User getUserFromJwtToken(String jwt) throws Exception;
	User getUserById(Long id) throws UserException;
	List<User> getAllUsers();

}
