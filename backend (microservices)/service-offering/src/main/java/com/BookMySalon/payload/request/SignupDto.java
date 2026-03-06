package com.BookMySalon.payload.request;

import com.BookMySalon.domain.UserRole;

import lombok.Data;

@Data
public class SignupDto {
	private String email;
	private String password;
	private String phone;
	private String fullName;
	private UserRole role;
}