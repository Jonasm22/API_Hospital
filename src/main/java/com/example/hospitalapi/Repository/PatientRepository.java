package com.example.hospitalapi.Repository;

import com.example.hospitalapi.Model.Patient;
import com.example.hospitalapi.Model.Person;
import com.example.hospitalapi.Model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
/*
    @Query("SELECT p FROM Patient p WHERE LOWER(p.person.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Patient> searchByName(@Param("name") String name, Pageable pageable);

 */

    List<Patient> findByStatus(Status status);

    Page<Patient> findByStatus(Status status, Pageable pageable);

    boolean existsByPerson(Person person);

    @Query("SELECT p FROM Patient p JOIN User u ON u.person=p.person WHERE u.username = :username")
    Optional<Patient> findByUserUsername(@Param("username")String username);
}
