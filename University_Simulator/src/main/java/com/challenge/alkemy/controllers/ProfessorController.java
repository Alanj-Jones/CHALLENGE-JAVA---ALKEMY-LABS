package com.challenge.alkemy.controllers;

import javax.validation.Valid;

import com.challenge.alkemy.models.Professor;
import com.challenge.alkemy.repositories.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepo;

    @GetMapping("/Admin/professors")
    private String professors(Model model) {
        model.addAttribute("professors", professorRepo.findAll());
        // Iterable<Professor> profList = professorRepo.findAll();
        // Map<Integer,String> pair = new HashMap<>();
        // for(Professor p : profList) {
        //     pair.put(p.getProfessorId(), p.getFirstName() + " "+ p.getLastName());
        // }
        // // th:text="${prof.get(professor.professorId)}"
        // model.addAttribute("pair", pair);
        return "professorList";
    }
    
    @GetMapping("/Admin/addProfessor")
    private String newProfessor(Model model) {
        Professor p = new Professor();
        model.addAttribute("prof", p);
        return "addProfessor";
    }
    
    @PostMapping("/Admin/professorCreated")
    private String professorCreation(@Valid @ModelAttribute(value = "prof") Professor professor, BindingResult result) {
        if (result.hasErrors()) {
            return "addProfessor";
        }

        try {
            professorRepo.save(professor);
        } catch (Exception e) {    
            String msg = "El DNI seleccionado ya esta en uso";
            return "redirect:/Admin/addProfessor?error=true&msg=" + msg;
        }
        return "redirect:/Admin/professors";
    }

    @GetMapping("/Admin/professor/delete/{professorId}")
    public String deleteProfessor(@PathVariable(name = "professorId") Integer professorId) {
        professorRepo.deleteById(professorId);

        return "redirect:/Admin/professors";
    }
    
}
