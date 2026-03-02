package com.deploy.praktikum.mapper;

import com.deploy.praktikum.model.dto.UserDto;
import com.deploy.praktikum.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserDto toUserData (User user);

}
