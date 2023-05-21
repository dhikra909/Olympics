package com.Olympic.Olympic.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.awt.SystemColor.text;

public class GeneralControlle {

//    SlackClient slackClient;

    @GetMapping(value = "test")
    @PreAuthorize("hasRole('USER')")
    public String test(){
        return "${spring.profiles.active}";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
        public String adminOnly() {
            return "You are an admin!";
        }
}
