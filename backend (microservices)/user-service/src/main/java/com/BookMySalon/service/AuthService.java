package com.BookMySalon.service;

import com.BookMySalon.exception.UserException;
import com.BookMySalon.payload.request.SignupDto;
import com.BookMySalon.payload.response.AuthResponse;

public interface AuthService {
    AuthResponse login(String username, String password) throws Exception;
    AuthResponse signup(SignupDto req) throws Exception;
    AuthResponse getAccessTokenFromRefreshToken(String refreshToken) throws Exception;
}
