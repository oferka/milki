package org.ok.milki.metadata.sample.product;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.product.Product;
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
public class DefaultSampleProductProvider implements SampleProductProvider {

    @Autowired
    private IdGenerator idGenerator;

    @Override
    public @NotNull Product getProduct(@NotNull Account account) {
        List<Product> products = getProducts(account);
        return products.get(0);
    }

    @Override
    public @NotNull List<Product> getProducts(@NotNull Account account, @Min(value = 1, message = "Number of products should not be less than 1") @Max(value = 5, message = "Number of products should not be greater than 5") int count) {
        List<Product> products = getProducts(account);
        return products.subList(0, count);
    }

    private @NotNull List<Product> getProducts(@NotNull Account account) {
        return asList(
                getProduct("Product 1", account),
                getProduct("Product 2", account),
                getProduct("Product 3", account),
                getProduct("Product 4", account),
                getProduct("Product 5", account)
        );
    }

    private @NotNull Product getProduct(@NotNull @Size(min = 2, max = 64) @NotBlank String name, @NotNull Account account) {
        return new Product(idGenerator.generate(), name, account);
    }
}
