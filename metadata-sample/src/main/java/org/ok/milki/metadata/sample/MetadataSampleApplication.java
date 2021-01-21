package org.ok.milki.metadata.sample;

import org.ok.milki.metadata.model.customer.Customer;
import org.ok.milki.metadata.sample.customer.SampleCustomerProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class MetadataSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataSampleApplication.class);
    }

    @Bean
    public CommandLineRunner helloWorld(SampleCustomerProvider sampleCustomerProvider) {
        return args -> {
            List<Customer> customers = sampleCustomerProvider.getCustomers(3);
            System.out.println(customers);
        };
    }
}
