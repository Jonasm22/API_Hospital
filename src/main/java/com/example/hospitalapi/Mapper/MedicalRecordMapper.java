package com.example.hospitalapi.Mapper;
import com.example.hospitalapi.DTO.request.MedicalRecordRequestDTO;
import com.example.hospitalapi.DTO.response.MedicalRecordResponseDTO;
import com.example.hospitalapi.Mapper.config.MapperConfiguration;
import com.example.hospitalapi.Model.MedicalRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(config = MapperConfiguration.class, uses = {PatientMapper.class, EmployeeMapper.class})
public interface MedicalRecordMapper {


    @Mapping(source = "patientId", target = "patient.id")
    @Mapping(source = "employeeId", target = "employee.id")
    MedicalRecord toEntity(MedicalRecordRequestDTO dto);


    MedicalRecordResponseDTO toResponse(MedicalRecord medicalRecordEntity);


    @Mapping(source = "patientId", target = "patient.id")
    @Mapping(source = "employeeId", target = "employee.id")
    void updateEntity(@MappingTarget MedicalRecord medicalRecordEntity, MedicalRecordRequestDTO dto);

}