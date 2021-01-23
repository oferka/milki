package org.ok.milki.metadata.sample;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.customer.Customer;
import org.ok.milki.metadata.sample.customer.SampleCustomerProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotNull;
import java.util.List;

@SpringBootApplication(scanBasePackages = "org.ok.milki")
@Slf4j
public class MetadataSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataSampleApplication.class);
    }

    @Bean
    public CommandLineRunner helloWorld(SampleCustomerProvider sampleCustomerProvider) {
        return args -> {
            List<Customer> customers = sampleCustomerProvider.getCustomers(3);
            log(customers);
        };
    }

    private void log(@NotNull List<Customer> customers) {
        for(Customer customer : customers) {
            log.info(customer.toString());
        }
    }
}
