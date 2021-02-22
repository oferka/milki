package org.ok.milki.metadata.sample.tenant;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SampleTenantProviderTest {

    @Autowired
    private SampleTenantProvider sampleTenantProvider;

    @Test
    void getTenant() {
        Tenant tenant = sampleTenantProvider.getTenant();
        log(tenant);
        assertNotNull(tenant);
    }

    @Test
    void getTenants() {
        int count = 3;
        List<Tenant> tenants = sampleTenantProvider.getTenants(count);
        log(tenants.toArray(new Tenant[0]));
        assertEquals(count, tenants.size());
    }

    private void log(@NotNull Tenant... tenants) {
        for(Tenant tenant : tenants) {
            log.info(tenant.toString());
        }
    }
}