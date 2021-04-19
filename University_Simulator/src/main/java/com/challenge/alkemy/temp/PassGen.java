package com.challenge.alkemy.temp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String raw = "1234";

        String enc = encoder.encode(raw);
        System.out.println(enc);
    }
}
