package com.example.demo.customers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Optional<Candidate> findCandidateByEmail(String email);
    Optional<Candidate> findCandidateByUsername(String username);

    Candidate findByUsername(CharSequence username);
}
