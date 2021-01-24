package org.ok.milki.metadata.sample.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.customer.Customer;
import org.ok.milki.metadata.model.product.Product;
import org.ok.milki.metadata.sample.account.SampleAccountProvider;
import org.ok.milki.metadata.sample.customer.SampleCustomerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotNull;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class SampleProductProviderTest {

    @Autowired
    private SampleCustomerProvider sampleCustomerProvider;

    @Autowired
    private SampleAccountProvider sampleAccountProvider;

    @Autowired
    private SampleProductProvider sampleProductProvider;

    @Test
    void getProduct() {
        Customer customer = sampleCustomerProvider.getCustomer();
        Account account = sampleAccountProvider.getAccount(customer);
        Product product = sampleProductProvider.getProduct(account);
        log(product);
        assertNotNull(product);
    }

    @Test
    void getProducts() {
        int count = 2;
        Customer customer = sampleCustomerProvider.getCustomer();
        Account account = sampleAccountProvider.getAccount(customer);
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