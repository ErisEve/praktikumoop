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
    private LocalDate dateDeadline;
    private boolean workFromHome;
    private int viewCount;
    private int likeCount;
    private String job;

    public Ad(String description, LocalDate dateDeadline, boolean workFromHome, int viewCount, int likeCount,
            String job) {
        this.description = description;
        this.dateDeadline = dateDeadline;
        this.workFromHome = workFromHome;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.job = job;
    }

    public Ad() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDateOfPosting() {
        return dateOfPosting;
    }

    public LocalDate getDateDeadline() {
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

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDateOfPosting(LocalDate dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public void setDateDeadline(LocalDate dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    public void setWorkFromHome(boolean workFromHome) {
        this.workFromHome = workFromHome;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
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
