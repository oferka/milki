package org.ok.milki.metadata.sample.user;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.model.user.User;
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
public class DefaultSampleUserProvider implements SampleUserProvider {

    private final IdGenerator idGenerator;

    @Autowired
    public DefaultSampleUserProvider(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public @NotNull User getUser(@NotNull Tenant tenant) {
        List<User> users = getUsers(tenant);
        return users.get(0);
    }

    @Override
    public @NotNull List<User> getUsers(@NotNull Tenant tenant, @Min(value = 1, message = "Number of users should not be less than 1") @Max(value = 5, message = "Number of users should not be greater than 5") int count) {
        List<User> users = getUsers(tenant);
        return users.subList(0, count);
    }

    private @NotNull List<User> getUsers(@NotNull Tenant tenant) {
        return asList(
                getUser("User 1", tenant),
                getUser("User 2", tenant),
                getUser("User 3", tenant),
                getUser("User 4", tenant),
                getUser("User 5", tenant)
        );
    }

    private @NotNull User getUser(@NotNull @Size(min = 2, max = 64) @NotBlank String name, @NotNull Tenant tenant) {
        return new User(idGenerator.generate(), name, tenant);
    }
}
