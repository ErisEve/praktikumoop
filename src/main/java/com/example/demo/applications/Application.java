package com.example.demo.applications;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Application {
    @Id
    @SequenceGenerator(name = "application_sequence", sequenceName = "application_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_sequence")
    private Long id;
    private int idClient;
    private int idJob;
    private String experience;
    private String education;
    private LocalDate date;

    public Application(int idClient, int idJob, String experience, String education) {
        this.idClient = idClient;
        this.idJob = idJob;
        this.education = education;
        this.experience = experience;
    }
    /*
     * Date date = new Date( ); SimpleDateFormat ft =new SimpleDateFormat
     * ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
     */

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Application() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", idClient='" + idClient + '\'' + ", idJob='" + idJob + '\''
                + ", experience='" + experience + '\'' + ", education='" + education + '\'' + '}';
    }
}