package com.challenge.alkemy;

public class User {

    private int user_id;
    private Role user_role;
    
    public User(){}

    public User(Role role, int id) {
        this.user_id = id;
        this.user_role = role;

    }
}
