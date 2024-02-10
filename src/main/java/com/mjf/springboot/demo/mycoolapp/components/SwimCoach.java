package com.mjf.springboot.demo.mycoolapp.components;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim harder bro.";
    }
}
