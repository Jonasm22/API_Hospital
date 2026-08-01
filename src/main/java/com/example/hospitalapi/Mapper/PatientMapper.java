package com.example.hospitalapi.Mapper;
import com.example.hospitalapi.DTO.request.PatientRequestDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(config = MapperConfiguration.class, uses = {PersonMapper.class})
public interface PatientMapper {

    @Mapping(source = "personId", target = "person.id")
    Patient toEntity(PatientRequestDTO dto);

    PatientRequestDTO toResponse(Patient entity);

    @Mapping(source = "personId", target = "person.id")
    void updateEntity(@MappingTarget Patient entity, PatientRequestDTO dto);

}
