package com.example.hospitalapi.repository;

import com.example.hospitalapi.Model.Employee;
import com.example.hospitalapi.Model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE LOWER(e.person.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Employee> searchByName(@Param("name") String name, Pageable pageable);

    Optional<Employee> findByPerson(Person person);


}
