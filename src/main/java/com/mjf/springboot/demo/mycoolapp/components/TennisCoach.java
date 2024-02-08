package com.mjf.springboot.demo.mycoolapp.components;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private TennisCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice the backhand!";
    }
}
