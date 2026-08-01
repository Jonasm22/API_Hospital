package com.example.hospitalapi.Mapper;

import com.example.hospitalapi.DTO.request.UserRequestDTO;
import com.example.hospitalapi.DTO.response.UserResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class, uses = {PersonMapper.class})
public interface UserMapper {

    User toEntity(UserRequestDTO dto);

    @Mapping(source = "username", target = "user") // verificar
    UserResponseDTO toResponse(User entity);

    void updateEntity(@MappingTarget User entity, UserRequestDTO dto);

}
