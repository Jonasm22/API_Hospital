package com.example.hospitalapi.Mapper;

import com.example.hospitalapi.DTO.request.PatientRequestDTO;
import com.example.hospitalapi.DTO.request.PersonRequestDTO;
import com.example.hospitalapi.DTO.response.PersonResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.Patient;
import com.example.hospitalapi.Model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class)

public interface PersonMapper {

    Person toEntity(PersonRequestDTO dto);

    PersonResponseDTO toResponse(Person entity);

    void updateEntity(@MappingTarget Person entity, PersonRequestDTO dto);



}
