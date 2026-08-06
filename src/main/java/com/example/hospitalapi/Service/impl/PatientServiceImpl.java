package com.example.hospitalapi.Service.impl;

import com.example.hospitalapi.DTO.request.PatientRequestDTO;
import com.example.hospitalapi.DTO.response.PatientResponseDTO;
import com.example.hospitalapi.Model.Status;
import com.example.hospitalapi.Service.PatientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PatientServiceImpl  implements PatientService{
    @Override
    public PatientResponseDTO createPatient(PatientResponseDTO requestDTO) {
        return null;
    }

    @Override
    public PatientResponseDTO getPatientById(Long id) {
        return null;
    }

    @Override
    public PatientResponseDTO updatePatient(Long id, PatientRequestDTO requestDTO) {
        return null;
    }

    @Override
    public void deletePatient(Long id) {

    }

    @Override
    public Page<PatientResponseDTO> toListPatient(Pageable pageable) {
        return null;
    }

    @Override
    public Page<PatientResponseDTO> searchPatientByStatus(Status status, Pageable pageable) {
        return null;
    }

    @Override
    public List<PatientResponseDTO> searchActivePatient() {
        return List.of();
    }
}
