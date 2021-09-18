package com.example.demo.applications;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Application {
    @Id
    // @SequenceGenerator(name = "application_sequence", sequenceName = "application_sequence", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.AUTO) private Long id;
    private Long idClient;
    private Long idAd;
    private String experience;
    private String education;
    private LocalDate date;

    public Application(Long idClient, Long idAd) {
        this.idClient = idClient;
        this.idAd = idAd;
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

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdAd() {
        return idAd;
    }

    public void setIdAd(Long idAd) {
        this.idAd = idAd;
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
        return "Application{" + "id=" + id + ", idClient='" + idClient + '\'' + ", idAd='" + idAd + '\''
                + ", experience='" + experience + '\'' + ", education='" + education + '\'' + '}';
    }
}