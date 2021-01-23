package org.ok.milki.metadata.sample.account;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.customer.Customer;
import org.ok.milki.metadata.sample.customer.SampleCustomerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SampleAccountProviderTest {

    @Autowired
    private SampleCustomerProvider sampleCustomerProvider;

    @Autowired
    private SampleAccountProvider sampleAccountProvider;

    @Test
    void getAccount() {
        Customer customer = sampleCustomerProvider.getCustomer();
        Account account = sampleAccountProvider.getAccount(customer);
        log(account);
        assertNotNull(account);
    }

    @Test
    void getAccounts() {
        int count = 2;
        Customer customer = sampleCustomerProvider.getCustomer();
        List<Account> accounts = sampleAccountProvider.getAccounts(customer, count);
        log(accounts.toArray(new Account[0]));
        assertEquals(count, accounts.size());
    }

    private void log(@NotNull Account... accounts) {
        for(Account account : accounts) {
            log.info(account.toString());
        }
    }
}