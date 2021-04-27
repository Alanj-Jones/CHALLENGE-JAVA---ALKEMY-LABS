package com.challenge.alkemy.controllers;

import com.challenge.alkemy.repositories.SubjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    
    @Autowired
    SubjectRepository subjectRepo;

    @GetMapping("/Student/subjects")
    public String studentSubjects() {
        return "studentSubjects";
    }
    
    @GetMapping("/subjects")
    public String availableSubjects(Model model) {
        model.addAttribute("subjectList", subjectRepo.findAll());
        return "availableSubjects";
    }
}
