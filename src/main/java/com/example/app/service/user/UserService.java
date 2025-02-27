package com.example.app.service.user;

import com.example.app.dto.UserDto;
import com.example.app.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}