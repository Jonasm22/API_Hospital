package com.example.hospitalapi.Service.impl;

import com.example.hospitalapi.DTO.request.MedicalRecordRequestDTO;
import com.example.hospitalapi.DTO.response.MedicalRecordResponseDTO;
import com.example.hospitalapi.Mapper.MedicalRecordMapper;
import com.example.hospitalapi.Model.Status;
import com.example.hospitalapi.Repository.EmployeeRepository;
import com.example.hospitalapi.Repository.MedicalRecordRepository;
import com.example.hospitalapi.Repository.PatientRepository;
import com.example.hospitalapi.Service.MedicalRecordService;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
@RequiredArgsConstructor
@Slf4j // Annotation to create a logger to log information
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    //Service Logic
    private final MedicalRecordRepository medicalRecordRepository;
    private final PatientRepository patientRepository;
    private final EmployeeRepository employeeRepository;
    private final MedicalRecordMapper medicalRecordMapper; //Extract Mapper porque



    @Override
    @Transactional //Executes method operations within a single database transaction (Rolls back on error)
    public MedicalRecordResponseDTO createMedicalReport(MedicalRecordResponseDTO responseDTO) {

        if(responseDTO.getAppointmentDate() == null) {
            return null;
        }
        return null;

    }

    @Override
    @Transactional(readOnly = true)
    public MedicalRecordResponseDTO getMedicalRecordById(Long id) {


        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> getAllMedicalRecords(Pageable pageable) {
        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> getMedicalRecordsByPatient(Long patientId, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> getMedicalRecordsByEmployee(Long employeeId, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> getMedicalRecordsByStatus(Status state, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> getMedicalRecordsByDate(LocalDateTime startDate, LocalDateTime endDate, Pageable pageable) {
        return null;
    }

    @Override
    public Page<MedicalRecordResponseDTO> searchMedicalRecordsByReason(String reason, Pageable pageable) {
        return null;
    }

    @Override
    public MedicalRecordResponseDTO updateMedicalRecord(Long id, MedicalRecordRequestDTO request) {
        return null;
    }

    @Override
    public void deleteMedicalRecord(Long id) {

    }

    @Override
    public Page<MedicalRecordResponseDTO> getAuthenticatedPatientMedicalRecords(Pageable pageable) {
        return null;
    }
}
