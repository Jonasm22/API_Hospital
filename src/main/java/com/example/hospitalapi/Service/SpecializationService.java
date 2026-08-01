package com.example.hospitalapi.Service;

import com.example.hospitalapi.DTO.request.SpecialityRequestDTO;
import com.example.hospitalapi.DTO.response.MedicalRecordResponseDTO;
import com.example.hospitalapi.DTO.response.SpecialityResponseDTO;
import com.example.hospitalapi.Model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface SpecializationService {
    SpecialityResponseDTO createSpecialization (SpecialityRequestDTO requestDTO);
    SpecialityResponseDTO updateSpecialization (Long id, SpecialityRequestDTO requestDTO);
    SpecialityResponseDTO getSpecializationById (Long id);
    void deleteSpecialization(Long id);

    Page<SpecialityResponseDTO> listBySpecialization(Pageable pageable);
    Page<SpecialityResponseDTO> searchSpecializationByName(String name, Pageable pageable);
    Page<SpecialityResponseDTO> getListByStatus(Status status, Pageable pageable);





}
