package com.example.demo.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    public void addNewJob(Job job) {
        jobRepository.save(job);
    }

    public void deleteJob(Long id) {
        boolean b = jobRepository.existsById(id);
        if (!b) {
            throw new IllegalStateException("Job doesn't exists");
        }
        jobRepository.deleteById(id);
    }
}
