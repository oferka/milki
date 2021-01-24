package org.ok.milki.metadata.sample.product;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.model.account.Account;
import org.ok.milki.metadata.model.product.Product;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface SampleProductProvider {

    @NotNull Product getProduct(@NotNull Account account);

    @NotNull List<Product> getProducts(@NotNull Account account, @Min(value = 1, message = "Number of products should not be less than 1") @Max(value = 5, message = "Number of products should not be greater than 5") int count);
}
