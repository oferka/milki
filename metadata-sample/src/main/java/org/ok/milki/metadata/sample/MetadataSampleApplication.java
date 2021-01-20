package org.ok.milki.metadata.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MetadataSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataSampleApplication.class);
    }

    @Bean
    public CommandLineRunner helloWorld() {
        return args -> {
            System.out.println("hello world");
        };
    }
}
