package com.example.hospitalapi.Service;

import com.example.hospitalapi.DTO.request.MedicalRecordRequestDTO;
import com.example.hospitalapi.DTO.response.MedicalRecordResponseDTO;
import com.example.hospitalapi.Model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface MedicalRecordService {

        MedicalRecordResponseDTO createMedicalReport(MedicalRecordResponseDTO responseDTO);
        MedicalRecordResponseDTO getMedicalRecordById(Long id);

        Page<MedicalRecordResponseDTO> getAllMedicalRecords(Pageable pageable);

        Page<MedicalRecordResponseDTO> getMedicalRecordsByPatient(Long patientId, Pageable pageable);

        Page<MedicalRecordResponseDTO> getMedicalRecordsByEmployee(Long employeeId, Pageable pageable);

        Page<MedicalRecordResponseDTO> getMedicalRecordsByStatus(Status state, Pageable pageable);

        Page<MedicalRecordResponseDTO> getMedicalRecordsByDate(LocalDateTime startDate,
                                                               LocalDateTime endDate,
                                                               Pageable pageable
        );

        Page<MedicalRecordResponseDTO> searchMedicalRecordsByReason(
                String reason,
                Pageable pageable
        );

        MedicalRecordResponseDTO updateMedicalRecord(
                Long id,
                MedicalRecordRequestDTO request
        );

        void deleteMedicalRecord(Long id);

        Page<MedicalRecordResponseDTO> getAuthenticatedPatientMedicalRecords(
                Pageable pageable
        );
    }





