package com.challenge.alkemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String mainPage() {
        return "welcomePage";
    }
    
}
