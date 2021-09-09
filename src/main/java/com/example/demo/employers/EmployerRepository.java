package com.example.demo.employers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long> {
    Optional<Employer> findEmployerByEmail(String email);

    Employer findByUsername(CharSequence username);
}
