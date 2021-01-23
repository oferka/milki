package org.ok.milki.metadata.sample.customer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SampleCustomerProviderTest {

    @Autowired
    private SampleCustomerProvider sampleCustomerProvider;

    @Test
    void getCustomer() {
        Customer customer = sampleCustomerProvider.getCustomer();
        log(customer);
        assertNotNull(customer);
    }

    @Test
    void getCustomers() {
        int count = 3;
        List<Customer> customers = sampleCustomerProvider.getCustomers(count);
        log(customers.toArray(new Customer[0]));
        assertEquals(count, customers.size());
    }

    private void log(@NotNull Customer... customers) {
        for(Customer customer : customers) {
            log.info(customer.toString());
        }
    }
}