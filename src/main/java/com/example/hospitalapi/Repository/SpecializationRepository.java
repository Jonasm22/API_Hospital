package com.example.hospitalapi.Repository;

import com.example.hospitalapi.Model.Specialization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

    @Query("SELECT s FROM Specialization s WHERE LOWER(s.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Specialization> searchByName(@Param("name") String name, Pageable pageable);
}
