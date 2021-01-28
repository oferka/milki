package org.ok.milki.metadata.server.service;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.server.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Service
@Slf4j
@Validated
public class DefaultTenantService implements TenantService {

    private final TenantRepository tenantRepository;

    public DefaultTenantService(@Autowired TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Override
    public @NotNull Tenant save(@Valid @NotNull Tenant tenant) {
        return tenantRepository.save(tenant);
    }

    @Override
    public void delete(@Valid @NotNull Tenant tenant) {
        tenantRepository.delete(tenant);
    }

    @Override
    public @NotNull Iterable<Tenant> findAll() {
        return tenantRepository.findAll();
    }
}
