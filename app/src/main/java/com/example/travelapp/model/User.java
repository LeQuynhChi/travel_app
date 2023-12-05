package com.example.travelapp.model;

public class User {

    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String avatar;

    public User(String username, String firstName, String lastName, String phoneNumber, String password, String avatar) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatar() {
        return avatar;
    }
}
