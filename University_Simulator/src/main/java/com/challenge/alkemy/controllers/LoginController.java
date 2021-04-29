package com.challenge.alkemy.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.challenge.alkemy.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    HttpSession session;

    @Autowired
    UserRepository userRepo;


    @GetMapping("/")
    public String mainPage() {
        return "redirect:login";
    }

    @GetMapping("/login")
    public String login() {
        if (isAuthenticated()) {
            return "redirect:menu";
        }
        return "login";
    }

    @GetMapping("/menu")
    public String menu(HttpServletRequest request) {
        session = request.getSession();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        session.setAttribute("userId", userRepo.findByUsername(auth.getName()).get().getId());
        return "afterLogin";
    }

    @GetMapping("/error")
    public String error() {
        return "redirect:login";
    }

    private boolean isAuthenticated() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || AnonymousAuthenticationToken.class.isAssignableFrom(authentication.getClass())) {
            return false;
        }
        return authentication.isAuthenticated();
        }
        
}
