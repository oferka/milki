package org.ok.milki.metadata.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.ok.milki")
public class MetadataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataServerApplication.class);
    }
}
