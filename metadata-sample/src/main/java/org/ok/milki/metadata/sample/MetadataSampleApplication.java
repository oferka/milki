package org.ok.milki.metadata.sample;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.sample.tenant.SampleTenantProvider;
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
    public CommandLineRunner helloWorld(SampleTenantProvider sampleTenantProvider) {
        return args -> {
            List<Tenant> tenants = sampleTenantProvider.getTenants(3);
            log(tenants);
        };
    }

    private void log(@NotNull List<Tenant> tenants) {
        for(Tenant tenant : tenants) {
            log.info(tenant.toString());
        }
    }
}
