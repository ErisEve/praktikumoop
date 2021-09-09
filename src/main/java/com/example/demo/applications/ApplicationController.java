package com.example.demo.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/applications")
    public List<Application> getApplication() {
        return applicationService.getApplications();
    }

    @PostMapping("/applications")
    public void registerNewApplication(@RequestBody Application application) {
        applicationService.addNewApplication(application);
    }

    @DeleteMapping(path = "/application/{applicationId}")
    public void deleteApplication(@PathVariable("applicationId") Long id) {
        applicationService.deleteApplication(id);
    }
    // add update method
}