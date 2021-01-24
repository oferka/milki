package org.ok.milki.metadata.sample.account;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.account.Account;
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
public class DefaultSampleAccountProvider implements SampleAccountProvider {

    private final IdGenerator idGenerator;

    @Autowired
    public DefaultSampleAccountProvider(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public @NotNull Account getAccount(@NotNull Customer customer) {
        List<Account> accounts = getAccounts(customer);
        return accounts.get(0);
    }

    @Override
    public @NotNull List<Account> getAccounts(@NotNull Customer customer, @Min(value = 1, message = "Number of accounts should not be less than 1") @Max(value = 5, message = "Number of accounts should not be greater than 5") int count) {
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
        return new Account(idGenerator.generate(), name, customer);
    }
}
