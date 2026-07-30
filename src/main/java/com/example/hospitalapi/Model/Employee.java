package com.example.hospitalapi.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false, foreignKey = @ForeignKey(name = "FK_employee_person"))
    private Person person;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<MedicalSpecialty> specialties = new HashSet<>();


}
