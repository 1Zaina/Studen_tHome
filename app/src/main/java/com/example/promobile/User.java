package com.example.promobile;

public class User {
    private String email;
    private String role;

    // Default constructor required for calls to DataSnapshot.getValue(User.class)
    public User(String email) {
    }

    public User(String email, String role) {
        this.email = email;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
