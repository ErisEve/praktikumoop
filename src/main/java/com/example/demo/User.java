package com.example.demo;

public abstract class User {
    public String type;

    public abstract CharSequence getUsername();

    public abstract CharSequence getPassword();

    public abstract Long getId();

    public abstract Object getPasswordConfirm();
}
