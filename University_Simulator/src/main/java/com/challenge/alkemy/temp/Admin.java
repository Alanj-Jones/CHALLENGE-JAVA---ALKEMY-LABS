package com.challenge.alkemy.temp;

import com.challenge.alkemy.User;

public class Admin extends User {

    private String username;
    private String password;

    public Admin() {}

    public Admin(String password, String username) {
        // super(Role.ADMIN);
        this.password = password;
        this.username= username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
