package org.ok.milki.metadata.sample.user;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.model.user.User;
import org.ok.milki.metadata.sample.tenant.SampleTenantProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SampleUserProviderTest {

    @Autowired
    private SampleTenantProvider sampleTenantProvider;

    @Autowired
    private SampleUserProvider sampleUserProvider;

    @Test
    void getUser() {
        Tenant tenant = sampleTenantProvider.getTenant();
        User user = sampleUserProvider.getUser(tenant);
        log(user);
        assertNotNull(user);
    }

    @Test
    void getUsers() {
        int count = 2;
        Tenant tenant = sampleTenantProvider.getTenant();
        List<User> users = sampleUserProvider.getUsers(tenant, count);
        log(users.toArray(new User[0]));
        assertEquals(count, users.size());
    }

    private void log(@NotNull User... users) {
        for(User user : users) {
            log.info(user.toString());
        }
    }
}