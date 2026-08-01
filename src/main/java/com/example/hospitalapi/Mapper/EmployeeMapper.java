package com.example.hospitalapi.Mapper;

import com.example.hospitalapi.DTO.request.EmployeeRequestDTO;
import com.example.hospitalapi.DTO.response.EmployeeResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class, uses = {PersonMapper.class})
public interface EmployeeMapper {

    @Mapping(source = "personId", target = "person.id")
    Employee toEntity(EmployeeRequestDTO dto);

    EmployeeResponseDTO toResponse(Employee entity);

    @Mapping(source = "personId", target = "person.id")
    void updateEntity(@MappingTarget Employee entity, EmployeeRequestDTO dto);

}
