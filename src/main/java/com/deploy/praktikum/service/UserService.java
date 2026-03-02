package com.deploy.praktikum.service;
import com.deploy.praktikum.model.dto.UserAddRequest;
import com.deploy.praktikum.model.dto.UserDto;

import java.util.List;


public interface UserService {
    UserDto addUser(UserAddRequest request);

    List<UserDto> getAllUser();

    UserDto getUserById(String id);

    UserDto updateUser(String id, UserAddRequest request);

    void deleteUser(String id);
}
