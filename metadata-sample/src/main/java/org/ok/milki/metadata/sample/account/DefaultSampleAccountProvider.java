package org.ok.milki.metadata.sample.account;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.customer.Customer;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;
import java.util.UUID;

import static java.util.Arrays.asList;

@Service
@Slf4j
@Validated
public class DefaultSampleAccountProvider implements SampleAccountProvider {

    @Override
    public @NotNull Account getAccount(@NotNull Customer customer) {
        List<Account> accounts = getAccounts(customer);
        return accounts.get(0);
    }

    @Override
    public @NotNull List<Account> getAccounts(@NotNull Customer customer, @Min(value = 1, message = "Number of account should not be less than 1") @Max(value = 5, message = "Number of account should not be greater than 5") int count) {
        List<Account> accounts = getAccounts(customer);
        return accounts.subList(0, count);
    }

    private @NotNull List<Account> getAccounts(@NotNull Customer customer) {
        return asList(
                getAccount("Account 1", customer),
                getAccount("Account 2", customer),
                getAccount("Account 3", customer),
                getAccount("Account 4", customer),
                getAccount("Account 5", customer)
        );
    }

    private @NotNull Account getAccount(@NotNull @Size(min = 2, max = 64) @NotBlank String name, @NotNull Customer customer) {
        return new Account(getId(), name, customer);
    }

    private @NotNull String getId() {
        return UUID.randomUUID().toString();
    }
}
