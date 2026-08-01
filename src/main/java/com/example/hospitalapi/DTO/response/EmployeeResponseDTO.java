package com.example.hospitalapi.DTO.response;
import com.example.hospitalapi.Model.Person;
import com.example.hospitalapi.Model.Role;

import com.example.hospitalapi.Model.Status;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponseDTO {

    private Long id;
    private Role role;
    private Status status;
    private PersonResponseDTO person;

}

