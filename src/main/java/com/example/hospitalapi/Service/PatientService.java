package com.example.hospitalapi.Service;

import com.example.hospitalapi.DTO.request.PatientRequestDTO;
import com.example.hospitalapi.DTO.request.SpecialityRequestDTO;
import com.example.hospitalapi.DTO.response.PatientResponseDTO;
import com.example.hospitalapi.DTO.response.SpecialityResponseDTO;
import com.example.hospitalapi.Model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PatientService {

    PatientResponseDTO createPatient(PatientResponseDTO requestDTO);
    PatientResponseDTO getPatientById (Long id);
    PatientResponseDTO updatePatient (Long id, PatientRequestDTO requestDTO);
    void deletePatient(Long id);

    Page<PatientResponseDTO > toListPatient(Pageable pageable);
    Page<PatientResponseDTO > searchPatientByStatus(Status status, Pageable pageable);
    List<PatientResponseDTO > searchActivePatient();
}
