package com.BookMySalon.payload.dto;

import com.BookMySalon.domain.UserRole;

import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String fullName;
    private String email;
    private  String role;

}
