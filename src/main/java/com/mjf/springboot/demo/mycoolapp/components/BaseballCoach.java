package com.mjf.springboot.demo.mycoolapp.components;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseballCoach implements Coach {

    private BaseballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "There's no crying in baseball. -Jackie Robinson, Field of Dreams";
    }
}
