package org.ok.milki.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.ok.milki")
@Slf4j
public class UtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UtilsApplication.class);
    }
}
