package com.example.hospitalapi.repository;

import com.example.hospitalapi.Model.Person;
import com.example.hospitalapi.Model.State;
import com.example.hospitalapi.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE LOWER(u.username) LIKE LOWER(CONCAT('%', :username, '%'))")
    Page<User> searchByUsername(@Param("username") String username, Pageable pageable);

    Optional<User> findByUsername(String username);

    Optional<User> findByPerson(Person person);

    boolean existsByUsername(String username);


}
