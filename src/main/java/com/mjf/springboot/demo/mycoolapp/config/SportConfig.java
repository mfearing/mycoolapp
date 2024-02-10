package com.mjf.springboot.demo.mycoolapp.config;

import com.mjf.springboot.demo.mycoolapp.components.Coach;
import com.mjf.springboot.demo.mycoolapp.components.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    /**
     * @Bean annotation good for turning third party class into a spring bean, otherwise just use @Component
     * @return
     */
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }

}
