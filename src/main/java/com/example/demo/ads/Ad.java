package com.example.demo.ads;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Ad {
    @Id
    @SequenceGenerator(name = "ad_sequence", sequenceName = "ad_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ad_sequence")
    private Long id;
    private String description;
    private LocalDate dateOfPosting;
    private String dateDeadline;
    private boolean workFromHome;
    private int viewCount=0;
    private int likeCount=0;
    private String job;
    private Long empId;

    public Ad(String description, String dateDeadline, boolean workFromHome, int viewCount, int likeCount,
            String job) {
        this.description = description;
        this.dateDeadline = dateDeadline;
        this.workFromHome = workFromHome;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.job = job;
    }
    public Ad(String description, String dateDeadline, boolean workFromHome, int viewCount, int likeCount,
            String job, Long empId) {
        this.description = description;
        this.dateDeadline = dateDeadline;
        this.workFromHome = workFromHome;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.job = job;
        this.empId = empId;
    }
    public Ad(String description, String dateDeadline, boolean workFromHome,
            String job) {
        this.description = description;
        this.dateDeadline = dateDeadline;
        this.workFromHome = workFromHome;
        this.viewCount = 0;
        this.likeCount = 0;
        this.job = job;
        // this.empId = empId;
    }
    public Ad(Long empId){
        this.empId = empId;
    }

    public Ad() {
    }

    public Long getId() {
        return id;
    }
    public Long getEmpId() {
        return empId;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfPosting() {
        return dateOfPosting;
    }

    public String getDateDeadline() {
        return dateDeadline;
    }

    public boolean isWorkFromHome() {
        return workFromHome;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public String getJob() {
        return job;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setEmpId(Long id) {
        this.empId = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateOfPosting(LocalDate dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public void setDateDeadline(String dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }

    public int incrementViewCount(){
        return this.viewCount++;
    }
    public int incrementLikeCount(){
        return this.likeCount++;
    }
    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Ad{" + "id=" + id + ", description='" + description + '\'' + ", dateOfPosting=" + dateOfPosting
                + ", dateDeadline=" + dateDeadline + ", workFromHome=" + workFromHome + ", viewCount=" + viewCount
                + ", likeCount=" + likeCount + ", job='" + job + '\'' + '}';
    }
}
