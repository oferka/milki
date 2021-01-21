package org.ok.milki.metadata.sample.customer;

import org.ok.milki.metadata.model.customer.Customer;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleCustomerProvider {

    @NotNull Customer getCustomer();

    @NotNull List<Customer> getCustomers(@Min(value = 1, message = "Number of customers should not be less than 1") @Max(value = 5, message = "Number of customers should not be greater than 5") int count);
}
