package com.example.demo.employers;

import com.example.demo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployerService extends UserService {
    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    public List<Employer> getEmployers() {
        return employerRepository.findAll();
    }

    public void addNewEmployer(Employer employer) {
        Optional<Employer> employerOptional = employerRepository.findEmployerByEmail(employer.getEmail());
        if (employerOptional.isPresent()) {
            throw new IllegalStateException("Email taken.");
        }
        employerRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        boolean b = employerRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Employer Company with that id doesn't exist");
        }
        employerRepository.deleteById(id);
    }

    @Override
    public Employer findByUsername(CharSequence username) {
        return employerRepository.findByUsername(username);
    }
    public Employer getEmployerById(Long id){
        return employerRepository.getById(id);
    }
}
