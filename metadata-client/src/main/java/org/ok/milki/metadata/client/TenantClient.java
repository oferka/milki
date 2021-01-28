package org.ok.milki.metadata.client;

import org.ok.milki.metadata.model.tenant.Tenant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.ok.milki.metadata.client.MetadataServerUriComponents.TENANT_URL;
import static org.ok.milki.metadata.model.MetadataPaths.TENANT_PATH;

@FeignClient(value = TENANT_PATH, url = TENANT_URL)
public interface TenantClient {

    @PostMapping(value = EMPTY)
    ResponseEntity<Tenant> save(@RequestBody @Valid @NotNull Tenant tenant);

    @DeleteMapping(value = EMPTY)
    ResponseEntity<Void> delete(@RequestBody @Valid @NotNull Tenant tenant);

    @GetMapping(value = EMPTY)
    ResponseEntity<List<Tenant>> findAll();
}
