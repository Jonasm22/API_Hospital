package com.example.hospitalapi.Model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "medical_specialty")

public class MedicalSpecialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false, foreignKey = @ForeignKey(name = "FK_medical_speciality_employee"))
    private Employee employee;

    @ManyToOne

    @JoinColumn(name = "specialization_id", nullable = false, foreignKey = @ForeignKey(name = "FK_medical_speciality_speciality"))
    private Specialization specialization;
}
