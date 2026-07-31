package com.example.hospitalapi.repository;

import com.example.hospitalapi.Model.Person;
import com.example.hospitalapi.Model.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Person> searchByName(@Param("name") String name, Pageable pageable);

    Page<Person> findByState(State state, Pageable pageable);

    Optional<Person> findByEmail(String email);
}
