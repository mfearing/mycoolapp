package com.mjf.springboot.demo.mycoolapp.components;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    private TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run, Forest, Run!";
    }
}
