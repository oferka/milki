package org.ok.milki.metadata.sample.account;

import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.tenant.Tenant;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleAccountProvider {

    @NotNull Account getAccount(@NotNull Tenant tenant);

    @NotNull List<Account> getAccounts(@NotNull Tenant tenant, @Min(value = 1, message = "Number of accounts should not be less than 1") @Max(value = 5, message = "Number of accounts should not be greater than 5") int count);
}
