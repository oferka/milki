package org.ok.milki.metadata.server.service;

import org.ok.milki.metadata.model.tenant.Tenant;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface TenantService {

    @NotNull Tenant save(@Valid @NotNull Tenant tenant);

    void delete(@Valid @NotNull Tenant tenant);
}
