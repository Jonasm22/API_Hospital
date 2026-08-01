package com.example.hospitalapi.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@ToString(exclude = {"patient", "employee"})
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "medical_record")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "appointment_date", nullable = false)
    private LocalDateTime appointmentDate;

    @Column(nullable = false)
    private String reason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false, foreignKey = @ForeignKey(name = "FK_medical_record_patient"))
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false, foreignKey = @ForeignKey(name = "FK_medical_record_employee"))
    private Employee employee;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

}
