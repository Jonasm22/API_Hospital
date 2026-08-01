package com.example.hospitalapi.Repository;

import com.example.hospitalapi.Model.Employee;
import com.example.hospitalapi.Model.MedicalSpecialty;
import com.example.hospitalapi.Model.Specialization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalSpecialtyRepository extends JpaRepository<MedicalSpecialty, Long> {

   /* @Query("SELECT ms FROM MedicalSpecialty ms WHERE LOWER(ms.specialization.name) LIKE LOWER(CONCAT('%', :specializationName, '%'))")
    //Page<MedicalSpecialty> searchBySpecializationName(@Param("specializationName") String specializationName, Pageable pageable);*/

    Page<MedicalSpecialty> findByEmployee(Employee employee, Pageable pageable);
    Page<MedicalSpecialty> findBySpecialization(Specialization specialization , Pageable pageable);

}
