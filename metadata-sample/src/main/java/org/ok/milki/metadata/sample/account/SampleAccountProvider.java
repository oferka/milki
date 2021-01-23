package org.ok.milki.metadata.sample.account;

import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.customer.Customer;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleAccountProvider {

    @NotNull Account getAccount(@NotNull Customer customer);

    @NotNull List<Account> getAccounts(@NotNull Customer customer, @Min(value = 1, message = "Number of account should not be less than 1") @Max(value = 5, message = "Number of account should not be greater than 5") int count);
}
