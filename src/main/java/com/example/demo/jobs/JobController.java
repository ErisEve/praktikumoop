package com.example.demo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }
    @PostMapping("/jobs")
    public void registerNewJob(@RequestBody Job job){
        jobService.addNewJob(job);
    }
    @DeleteMapping(path="/job/{jobId}")
    public void deleteJob(@PathVariable("jobId") Long id){
        jobService.deleteJob(id);
    }
    //add update method
}
