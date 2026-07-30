package com.example.hospitalapi.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "user")) // corregir columnames
//@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "FK_person_id")) // corregir columnames
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String user;

    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "person_id", nullable = false, foreignKey = @ForeignKey(name = "FK_user_person"))
    private Person person;

}
