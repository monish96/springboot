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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student monish = new Student(

                    "Monish",

                    LocalDate.of(1996, Month.JUNE, 23),
                    "monish.n@focusrtech.com"
            );
            Student sara = new Student(
                    "Sara",

                    LocalDate.of(1996, Month.JUNE, 23),
                    "Sara.k@focusrtech.com"
            );

            studentRepository.saveAll(
                    List.of(
                            monish, sara
                    )
            );
        };
    }

}
