package com.example.hospitalapi.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "person", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private  String email;

    @Enumerated(EnumType.STRING)
    private Status status;


}