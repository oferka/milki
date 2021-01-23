package org.ok.milki.metadata.sample.customer;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.customer.Customer;
import org.ok.milki.utils.id.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;

import static java.util.Arrays.asList;

@Service
@Slf4j
@Validated
public class DefaultSampleCustomerProvider implements SampleCustomerProvider {

    @Autowired
    private IdGenerator idGenerator;

    @Override
    public @NotNull Customer getCustomer() {
        List<Customer> customers = getCustomers();
        return customers.get(0);
    }

    @Override
    public @NotNull List<Customer> getCustomers(@Min(value = 1, message = "Number of customers should not be less than 1") @Max(value = 5, message = "Number of customers should not be greater than 5") int count) {
        List<Customer> customers = getCustomers();
        return customers.subList(0, count);
    }

    private @NotNull List<Customer> getCustomers() {
        return asList(
            getCustomer("Customer 1"),
            getCustomer("Customer 2"),
            getCustomer("Customer 3"),
            getCustomer("Customer 4"),
            getCustomer("Customer 5")
        );
    }

    private @NotNull Customer getCustomer(@NotNull @Size(min = 2, max = 64) @NotBlank String name) {
        return new Customer(idGenerator.generate(), name);
    }
}
