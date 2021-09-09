package com.example.demo.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CandidateController {
    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/candidates")
    public List<Candidate> getCandidates(){
        return candidateService.getCandidate();
    }
    @PostMapping("/candidates")
    public void registerNewCandidate(@RequestBody Candidate candidate){
        candidateService.addNewCandidate(candidate);
    }
    @DeleteMapping(path="/candidates/{candidateId}")
    public void deleteCandidate(@PathVariable("candidateId") Long id){
        candidateService.deleteCandidate(id);
    }
    //add update method
}
