package com.example.demo.employers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployerController {
    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/employers")
    public List<Employer> getEmployers(){
        return employerService.getEmployers();
    }
    @PostMapping("/employers")
    public void registerNewEmployer(@RequestBody Employer employer){
        employerService.addNewEmployer(employer);
    }
    @DeleteMapping(path="/employer/{employerId}")
    public void deleteEmployer(@PathVariable("employerId") Long id){
        employerService.deleteEmployer(id);
    }
    //add update method
}
