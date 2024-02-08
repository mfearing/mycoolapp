package com.mjf.springboot.demo.mycoolapp.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //prototype != singleton, new instance per
public class CricketCoach implements Coach {

    private CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes! :)";
    }

    @PostConstruct
    public void postConstruct(){
        //method called after bean is created due to @PostConstruct annotation
        System.out.println("In postConstruct(): "+ getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestory(){
        //method called after bean is created due to @PostConstruct annotation
        System.out.println("In preDestroy(): "+ getClass().getSimpleName());
    }
}
