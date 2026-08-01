package com.example.hospitalapi.DTO.request;

import com.example.hospitalapi.Model.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PersonRequestDTO {
    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private  String email;

    @NotNull(message = "State required")
    private Status status;

}

