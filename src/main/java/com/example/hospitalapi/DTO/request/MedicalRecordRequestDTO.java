package com.example.hospitalapi.DTO.request;

import com.example.hospitalapi.Model.Employee;
import com.example.hospitalapi.Model.State;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MedicalRecordRequestDTO {
    @NotNull(message = "appointment date required")
    private LocalDateTime appointmentDate;

    @NotBlank(message = "the reason of the appointment is required")
    private String reason;

    @NotNull(message = "patient required")
    private Long patientId;

    @NotNull(message = "employee required")
    private Employee employeeId;

    @NotNull(message = "State of the medical record is required")
    private State state;

}
