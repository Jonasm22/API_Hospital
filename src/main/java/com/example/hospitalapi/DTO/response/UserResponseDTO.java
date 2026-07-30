package com.example.hospitalapi.DTO.response;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class UserResponseDTO {

    private Long id;
    private String user;
    private PersonResponseDTO person;

}

