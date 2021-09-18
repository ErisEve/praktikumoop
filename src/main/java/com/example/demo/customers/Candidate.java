package com.example.demo.customers;

import com.example.demo.User;
import javax.persistence.*;

@Entity
@Table
public class Candidate extends User {
    @Id
    @SequenceGenerator(name = "candidate_sequence", sequenceName = "candidate_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "candidate_sequence")
    private Long id;
    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private String email;
    private String address;
    private String username;
    private String password;
    private boolean emailme;
    private String telephoneNumber;
    private String workingExperience;
    public String type = "candidate";

    public Candidate() {
    }

    public Candidate(String firstname, String lastname, String dateOfBirth, String email, String address,
            String username, String password, boolean emailme, String telephoneNumber, String workingExperience) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.emailme = emailme;
        this.telephoneNumber = telephoneNumber;
        this.workingExperience = workingExperience;
    }

    public Candidate(String firstname, String lastname, String email, String address, String username, String password,
            boolean emailme, String telephoneNumber, String workingExperience) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.emailme = emailme;
        this.telephoneNumber = telephoneNumber;
        this.workingExperience = workingExperience;
    }
public Candidate(String firstname, String lastname, String address, String dateOfBirth, String telephoneNumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\''
                + ", dateOfBirth=" + dateOfBirth + ", email='" + email + '\'' + ", address='" + address + '\''
                + ", username='" + username + '\'' + ", password='" + password + '\'' + ", emailme=" + emailme
                + ", telephoneNumber='" + telephoneNumber + '\'' + ", workingExperience='" + workingExperience + '\''
                + '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setWorkingExperience(String workingExperience) {
        this.workingExperience = workingExperience;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getWorkingExperience() {
        return workingExperience;
    }
}
