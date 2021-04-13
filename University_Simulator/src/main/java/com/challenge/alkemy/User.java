package com.challenge.alkemy;

public class User {

    private int userId;
    private Role userRole;
    
    public User(){}

    public User(Role role, int id) {
        this.userId = id;
        this.userRole = role;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Role getUserRole() {
        return this.userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
    
}
