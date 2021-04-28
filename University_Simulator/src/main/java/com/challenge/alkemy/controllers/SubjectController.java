package com.challenge.alkemy.controllers;

import javax.validation.Valid;

import com.challenge.alkemy.models.Subject;
import com.challenge.alkemy.repositories.ProfessorRepository;
import com.challenge.alkemy.repositories.SubjectRepository;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SubjectController {
    
    @Autowired
    SubjectRepository subjectRepo;

    @Autowired
    ProfessorRepository professorRepo;   
    
    @GetMapping("/subjects")
    public String availableSubjects(Model model) {
        model.addAttribute("subjectList", subjectRepo.findAll());
        model.addAttribute("professors", professorRepo.findAll());
        return "availableSubjects";
    }

    @GetMapping("/Admin/addSubject")
    private String newSubject(Model model) {
        Subject s = new Subject();
        model.addAttribute("subj", s);
        model.addAttribute("professors", professorRepo.findAll());
        return "addSubject";
    }

    @PostMapping("/Admin/subjectCreated")
    private String subjectCreation(@Valid @ModelAttribute(value = "subj") Subject subject, BindingResult result, Model model) {
        model.addAttribute("professors", professorRepo.findAll());
        if (result.hasErrors()) {
            return "addSubject";
        }
        subjectRepo.save(subject);
        return "redirect:/subjects";
    }

    @GetMapping("/Admin/subject/delete/{id}")
    public String deleteSubject(@PathVariable(name = "id") Integer id) {
        subjectRepo.deleteById(id);
        return "redirect:/subjects";
    }

    @GetMapping("/Admin/subject/edit/{id}")
    public String editSubject(@PathVariable(name = "id") Integer id, Model model) {
        Subject current = subjectRepo.findBySubjectId(id);
        model.addAttribute("currentSubject", current);
        model.addAttribute("professors", professorRepo.findAll());

        Subject s = new Subject();
        model.addAttribute("subj", s);

        return "modifySubject";
    }

    @PostMapping("/Admin/subjectEdited/{id}")
    private String editedSubject(@Valid @ModelAttribute(value = "subj") Subject edited, @PathVariable(name = "id") Integer id, BindingResult result, Model model) {       
        if (result.hasErrors()) {
            return "modifySubject";
        }
        model.addAttribute("professors", professorRepo.findAll());
        Subject subject = subjectRepo.findBySubjectId(id);
        subject.setName(edited.getName());
        subject.setDescription(edited.getDescription());
        subject.setStart_time(edited.getStart_time());
        subject.setEnd_time(edited.getEnd_time());
        subject.setProfessor_id(edited.getProfessor_id());
        subject.setCapacity(edited.getCapacity());

        subjectRepo.save(subject);
        return "redirect:/subjects";
    }
}
