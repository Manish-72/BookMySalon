package com.BookMySalon.mapper;

import org.springframework.stereotype.Service;

import com.BookMySalon.modal.User;
import com.BookMySalon.payload.dto.UserDTO;

@Service
public class UserMapper {

    public UserDTO mapToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setFullName(user.getFullName());
        userDTO.setRole(user.getRole().toString());

        return userDTO;
    }
}
