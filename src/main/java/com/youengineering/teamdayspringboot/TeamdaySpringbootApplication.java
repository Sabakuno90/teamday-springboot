package com.youengineering.teamdayspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeamdaySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamdaySpringbootApplication.class, args);
    }

    @Bean
    CommandLineRunner init(YouEngineerRepository youEngineerRepository) {
        return args -> {
            YouEngineer toby = new YouEngineer("Toby", "Baumgartner", 10);
            YouEngineer niki = new YouEngineer("Niki", "Vögtli", 10);
            youEngineerRepository.save(toby);
            youEngineerRepository.save(niki);
            youEngineerRepository.findAll().forEach(System.out::println);
        };
    }

}
