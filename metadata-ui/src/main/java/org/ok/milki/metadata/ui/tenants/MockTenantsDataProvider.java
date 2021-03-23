package org.ok.milki.metadata.ui.tenants;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockTenantsDataProvider implements TenantsDataProvider {

    @Override
    public int count() {
        return 10;
    }
}
