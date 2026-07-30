package com.example.hospitalapi.DTO.response;

import com.example.hospitalapi.Model.Employee;
import com.example.hospitalapi.Model.Patient;
import com.example.hospitalapi.Model.State;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MedicalRecordResponseDTO {

    private Long id;
    private LocalDateTime appointmentDate;
    private String reason;
    private State state;
    private PatientResponseDTO patient;
    private EmployeeResponseDTO employee;


}
