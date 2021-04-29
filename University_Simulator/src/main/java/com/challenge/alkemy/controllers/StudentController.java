package com.challenge.alkemy.controllers;

import javax.servlet.http.HttpSession;

import com.challenge.alkemy.models.User;
import com.challenge.alkemy.repositories.ProfessorRepository;
// import com.challenge.alkemy.repositories.StudentRepository;
import com.challenge.alkemy.repositories.SubjectRepository;
import com.challenge.alkemy.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {
    
    @Autowired
    SubjectRepository subjectRepo;

    @Autowired
    ProfessorRepository profRepo;

    @Autowired
    UserRepository userRepo;

    @Autowired
    HttpSession session;

    @GetMapping("/Student/subjects")
    public String studentSubjects(Model model) {
        Integer studentId = (Integer) session.getAttribute("userId");
        User user = userRepo.findById(studentId).get();
        model.addAttribute("subjectList", user.getSubjects().iterator());
        model.addAttribute("professors", profRepo.findAll());
        model.addAttribute("allSubjects", subjectRepo.findAll());


        return "studentSubjects";
    }

    @GetMapping("/Student/subject/register/{subjectId}")
    public String subjectRegister(@PathVariable(name = "subjectId") Integer subjectId, Model model) {
        Integer studentId = (Integer) session.getAttribute("userId");
        User user = userRepo.findById(studentId).get();
        user.getSubjects().add(subjectRepo.findBySubjectId(subjectId));
        userRepo.save(user);
        
        return "redirect:/Student/subjects";
    }
    
    
}
