package com.mjf.springboot.demo.mycoolapp.rest;

import com.mjf.springboot.demo.mycoolapp.components.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    @Autowired
    public void setCoach(@Qualifier("aquatic") Coach coach){
        //qualifier must be method name of @Bean annoatation in SportConfig, or the name given on the @Bean annotation
        this.coach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String getCoach(){
        return coach.getDailyWorkout();
    }


}
