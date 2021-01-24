package org.ok.milki.metadata.sample.tenant;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.tenant.Tenant;
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
public class DefaultSampleTenantProvider implements SampleTenantProvider {

    private final IdGenerator idGenerator;

    @Autowired
    public DefaultSampleTenantProvider(IdGenerator idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public @NotNull Tenant getTenant() {
        List<Tenant> tenants = getTenants();
        return tenants.get(0);
    }

    @Override
    public @NotNull List<Tenant> getTenants(@Min(value = 1, message = "Number of tenants should not be less than 1") @Max(value = 5, message = "Number of tenants should not be greater than 5") int count) {
        List<Tenant> tenants = getTenants();
        return tenants.subList(0, count);
    }

    private @NotNull List<Tenant> getTenants() {
        return asList(
            getTenant("Tenant 1"),
            getTenant("Tenant 2"),
            getTenant("Tenant 3"),
            getTenant("Tenant 4"),
            getTenant("Tenant 5")
        );
    }

    private @NotNull Tenant getTenant(@NotNull @Size(min = 2, max = 64) @NotBlank String name) {
        return new Tenant(idGenerator.generate(), name);
    }
}
