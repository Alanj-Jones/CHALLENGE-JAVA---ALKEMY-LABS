package com.challenge.alkemy.controllers;

import com.challenge.alkemy.Professor;
import com.challenge.alkemy.ProfessorRepository;
import com.challenge.alkemy.Subject;
import com.challenge.alkemy.SubjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    SubjectRepository subjectRepo;

    @Autowired
    ProfessorRepository professorRepo;

    @GetMapping("/Admin/professors")
    private String professors(Model model) {
        model.addAttribute("professors", professorRepo.findAll());
        return "professorList";
    }
    
    @GetMapping("/Admin/addProfessor")
    private String newProfessor() {
        return "addProfessor";
    }
    
    @PostMapping("/Admin/professorCreated")
    private String professorCreation(Professor professor) {
        professorRepo.save(professor);
        return "redirect:/Admin/professors";
    }

    @GetMapping("/Admin/addSubject")
    private String newSubject(Model model) {
        model.addAttribute("professors", professorRepo.findAll());
        return "addSubject";
    }

    @PostMapping("/Admin/subjectCreated")
    private String subjectCreation(Subject subject) {
        subjectRepo.save(subject);
        return "redirect:/subjects";
    }

}

// @GetMapping("/")
//     private String () {
//         return "";
//     }