package com.example.demo.jobs;

import javax.persistence.*;

@Entity
@Table
public class Job {
    @Id
    @SequenceGenerator(name = "job_sequence", sequenceName = "job_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_sequence")
    private Long id;
    private String category;
    private String subcategory;

    public Job(String category, String subcategory, Long adId) {
        this.category = category;
        this.subcategory = subcategory;
    }

    public Job() {

    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public void setAdId(Long adId) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Job{" + "id=" + id + ", category='" + category + '\'' + ", subcategory='" + subcategory + '\'' + '}';
    }
}
