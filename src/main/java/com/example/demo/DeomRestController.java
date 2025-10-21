package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeomRestController {
    Coach theCoach;
    @Autowired
    public DeomRestController(Coach theCoach) {
        this.theCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return theCoach.getDailyWorkout();
    }
}