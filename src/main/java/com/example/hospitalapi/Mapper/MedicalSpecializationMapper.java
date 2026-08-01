package com.example.hospitalapi.Mapper;

import com.example.hospitalapi.DTO.request.DoctorSpecialityRequestDTO;
import com.example.hospitalapi.DTO.response.DoctorSpecialityResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.MedicalSpecialty;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class, uses = {EmployeeMapper.class, SpecializationMapper.class})
public interface MedicalSpecializationMapper {

    @Mapping(source = "employeeId", target = "employee.id")
    @Mapping(source = "specialityId", target = "specialization.id")
    MedicalSpecialty toEntity(DoctorSpecialityRequestDTO dto);

    DoctorSpecialityResponseDTO toResponse(MedicalSpecialty entity);

    @Mapping(source = "employeeId", target = "employee.id")
    @Mapping(source = "specialityId", target = "specialization.id")
    void updateEntity(@MappingTarget MedicalSpecialty entity, DoctorSpecialityRequestDTO dto);

}
