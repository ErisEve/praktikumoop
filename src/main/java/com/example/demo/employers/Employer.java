package com.example.demo.employers;
import com.example.demo.User;

import javax.persistence.*;

@Entity
@Table
public class Employer extends User {
    @Id
    @SequenceGenerator(
            name = "employer_sequence",
            sequenceName = "employer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employer_sequence"
    )
    private Long id;
    private String companyName;
    private String place;
    private String industryBranch;
    private String contactNumber;
    private String email;
    private String postNumber;
    private String country;
    private String address;
    private String pib;
    private String username;
    private String password;
    private boolean emailme;
    private String linkToWebsite;

    public Employer(String companyName, String place, String industryBranch, String contactNumber, String email, String postNumber, String country, String address, String pib, String username, String password, boolean emailme, String linkToWebsite) {
        this.companyName = companyName;
        this.place = place;
        this.industryBranch = industryBranch;
        this.contactNumber = contactNumber;
        this.email = email;
        this.postNumber = postNumber;
        this.country = country;
        this.address = address;
        this.pib = pib;
        this.username = username;
        this.password = password;
        this.emailme = emailme;
        this.linkToWebsite = linkToWebsite;
    }

    public Employer() {

    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPlace() {
        return place;
    }

    public String getIndustryBranch() {
        return industryBranch;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPib() {
        return pib;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public Object getPasswordConfirm() {
        return null;
    }

    public boolean isEmailme() {
        return emailme;
    }

    public String getLinkToWebsite() {
        return linkToWebsite;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setIndustryBranch(String industryBranch) {
        this.industryBranch = industryBranch;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmailme(boolean emailme) {
        this.emailme = emailme;
    }

    public void setLinkToWebsite(String linkToWebsite) {
        this.linkToWebsite = linkToWebsite;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", place='" + place + '\'' +
                ", industryBranch='" + industryBranch + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                ", postNumber='" + postNumber + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", pib='" + pib + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", emailme=" + emailme +
                ", linkToWebsite='" + linkToWebsite + '\'' +
                '}';
    }
}
