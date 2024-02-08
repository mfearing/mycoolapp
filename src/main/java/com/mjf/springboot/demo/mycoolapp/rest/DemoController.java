package com.mjf.springboot.demo.mycoolapp.rest;

import com.mjf.springboot.demo.mycoolapp.components.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach coach,
                         @Qualifier("cricketCoach") Coach anotherCoach){
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getCoach(){
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        //check if prototype is used
        return "Comparing beans: myCoach == anotherCoach, " + (coach == anotherCoach);
    }

}
