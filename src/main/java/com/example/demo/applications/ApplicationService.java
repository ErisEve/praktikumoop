package com.example.demo.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }
    public List<Application> getApplicationsByCandidateId(Long id){
        return applicationRepository.getByIdClient(id);
    }

    public void addNewApplication(Application application) {
        applicationRepository.save(application);
    }

    public void deleteApplication(Long id) {
        boolean b = applicationRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Application doesn't exists");
        }
        applicationRepository.deleteById(id);
    }
}