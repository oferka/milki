package org.ok.milki.metadata.sample.user;

import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.model.user.User;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleUserProvider {

    @NotNull User getUser(@NotNull Tenant tenant);

    @NotNull List<User> getUsers(@NotNull Tenant tenant, @Min(value = 1, message = "Number of users should not be less than 1") @Max(value = 5, message = "Number of users should not be greater than 5") int count);
}
