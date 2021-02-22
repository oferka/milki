package org.ok.milki.metadata.sample.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.product.Product;
import org.ok.milki.metadata.model.tenant.Tenant;
import org.ok.milki.metadata.sample.account.SampleAccountProvider;
import org.ok.milki.metadata.sample.tenant.SampleTenantProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Slf4j
class SampleProductProviderTest {

    @Autowired
    private SampleTenantProvider sampleTenantProvider;

    @Autowired
    private SampleAccountProvider sampleAccountProvider;

    @Autowired
    private SampleProductProvider sampleProductProvider;

    @Test
    void getProduct() {
        Tenant tenant = sampleTenantProvider.getTenant();
        Account account = sampleAccountProvider.getAccount(tenant);
        Product product = sampleProductProvider.getProduct(account);
        log(product);
        assertNotNull(product);
    }

    @Test
    void getProducts() {
        int count = 2;
        Tenant tenant = sampleTenantProvider.getTenant();
        Account account = sampleAccountProvider.getAccount(tenant);
        List<Product> products = sampleProductProvider.getProducts(account, count);
        log(products.toArray(new Product[0]));
        assertEquals(count, products.size());
    }

    private void log(@NotNull Product... products) {
        for(Product product : products) {
            log.info(product.toString());
        }
    }
}