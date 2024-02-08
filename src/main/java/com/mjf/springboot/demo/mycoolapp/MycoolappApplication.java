package com.mjf.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication comprised of:
@EnableAutoConfiguration - enables spring boot's autoconfiguration support
@ComponentScan - scans for all component in current package
@Configuration - registers extra beans with @Bean or import other config classes
 */

@SpringBootApplication //(scanBasePackages = {"put.package.outside.of.mycoolapp.here", "accepts.list.of.packages"})
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
