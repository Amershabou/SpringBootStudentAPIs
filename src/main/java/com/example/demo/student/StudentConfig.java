package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student amer = new Student(
                    "Amer",
                    "amershabou@gmail.com",
                    LocalDate.of(1985, Month.JULY,22));
            Student rouba = new Student(
                    "Rouba",
                    "rouba.ishou@gmail.com",
                    LocalDate.of(1988, Month.FEBRUARY,4));
            repository.saveAll(List.of(amer, rouba));
        };
    }
}
