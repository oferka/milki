package org.ok.milki.metadata.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.server.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.ok.milki.metadata.model.MetadataPaths.TENANT_PATH;

@Slf4j
@RestController
@RequestMapping(path = TENANT_PATH)
public class TenantController extends AbstractMetadataController {

    private final TenantService tenantService;

    public TenantController(@Autowired TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping(path = EMPTY)
    public ResponseEntity<Tenant> save(@RequestBody @Valid @NotNull Tenant tenant) {
        Tenant savedTenant = tenantService.save(tenant);
        return ResponseEntity.ok(savedTenant);
    }

    @DeleteMapping(path = EMPTY)
    public ResponseEntity<Void> delete(@RequestBody @Valid @NotNull Tenant tenant) {
        tenantService.delete(tenant);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = EMPTY)
    public ResponseEntity<Iterable<Tenant>> findAll() {
        Iterable<Tenant> tenants = tenantService.findAll();
        return ResponseEntity.ok(tenants);
    }
}
