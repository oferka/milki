package org.ok.milki.metadata.ui.products;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockProductsDataProvider implements ProductsDataProvider {

    @Override
    public int count() {
        return 60;
    }
}
