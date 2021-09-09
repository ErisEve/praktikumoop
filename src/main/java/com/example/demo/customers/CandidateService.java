package com.example.demo.customers;

import com.example.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService extends UserService {
    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getCandidate(){
        return candidateRepository.findAll();
    }

    public void addNewCandidate(Candidate candidate) {
        Optional<Candidate> candidateOptional = candidateRepository.findCandidateByEmail(candidate.getEmail());
        if(candidateOptional.isPresent()){
            throw new IllegalStateException("Email taken.");
        }
        candidateOptional = candidateRepository.findCandidateByUsername(candidate.getUsername());
        if(candidateOptional.isPresent()){
            throw new IllegalStateException("Username taken.");
        }
        candidateRepository.save(candidate);
    }

    public void deleteCandidate(Long id) {
        boolean b = candidateRepository.existsById(id);
        if(!b){
            throw new IllegalStateException("Candidate with that id doesn't exist");
        }
        candidateRepository.deleteById(id);
    }

    @Override
    public Object findByUsername(CharSequence username) {
        return candidateRepository.findByUsername(username);
    }
}
