package org.ok.milki.metadata.ui.tenants;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientTenantsDataProvider implements TenantsDataProvider {

    @Override
    public int count() {
        return 11;
    }
}
