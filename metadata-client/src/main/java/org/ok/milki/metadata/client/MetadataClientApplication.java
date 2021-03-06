package org.ok.milki.metadata.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "org.ok.milki")
@EnableFeignClients
@Slf4j
public class MetadataClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataClientApplication.class);
    }
}
