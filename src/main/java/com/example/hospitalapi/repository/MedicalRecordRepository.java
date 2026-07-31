package com.example.hospitalapi.repository;

import com.example.hospitalapi.Model.Employee;
import com.example.hospitalapi.Model.MedicalRecord;
import com.example.hospitalapi.Model.Patient;
import com.example.hospitalapi.Model.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {

    Page<MedicalRecord>findByPatient(Patient patient, Pageable pageable);
    Page<MedicalRecord>findByEmployee(Employee employee, Pageable pageable);
    Page<MedicalRecord>findByState(State state, Pageable pageable);
    Page<MedicalRecord>findByAppointmentDateBetween(LocalDateTime start,LocalDateTime end, Pageable pageable);// no es seguro

    @Query("SELECT a FROM MedicalRecord a WHERE LOWER(a.reason) LIKE LOWER(CONCAT('%', :reason, '%'))")
    Page<MedicalRecord>searchByReason(@Param("reason")String reason, Pageable pageable);
}

