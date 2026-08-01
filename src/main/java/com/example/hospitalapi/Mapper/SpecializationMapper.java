package com.example.hospitalapi.Mapper;

import com.example.hospitalapi.DTO.request.SpecialityRequestDTO;
import com.example.hospitalapi.DTO.response.SpecialityResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.Specialization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class)
public interface SpecializationMapper {

    @Mapping(source = "user", target = "name") // verificar
    Specialization toEntity(SpecialityRequestDTO dto);

    SpecialityResponseDTO toResponse(Specialization entity);

    @Mapping(source = "user", target = "name") // Verificar
    void updateEntity(@MappingTarget Specialization entity, SpecialityRequestDTO dto);

}
