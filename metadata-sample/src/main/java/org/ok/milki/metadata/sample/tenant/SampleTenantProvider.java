package org.ok.milki.metadata.sample.tenant;

import org.ok.milki.metadata.model.tenant.Tenant;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleTenantProvider {

    @NotNull Tenant getTenant();

    @NotNull List<Tenant> getTenants(@Min(value = 1, message = "Number of tenants should not be less than 1") @Max(value = 5, message = "Number of tenants should not be greater than 5") int count);
}
