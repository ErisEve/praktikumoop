package com.example.demo.administrator;

import com.example.demo.User;
import javax.persistence.*;

@Entity
@Table
public class Administrator extends User {
    @Id
    @SequenceGenerator(name = "administrator_sequence", sequenceName = "administrator_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "administrator_sequence")
    private Long id;
    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Administrator() {

    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrator{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\''
                + '}';
    }
}
