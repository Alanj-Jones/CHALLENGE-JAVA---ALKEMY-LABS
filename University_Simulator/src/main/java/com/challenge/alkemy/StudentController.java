package com.challenge.alkemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentSubjects() {
        return "studentSubjects";
    }
    
    @GetMapping("/subjects")
    public String availableSubjects() {
        return "availableSubjects";
    }
}
