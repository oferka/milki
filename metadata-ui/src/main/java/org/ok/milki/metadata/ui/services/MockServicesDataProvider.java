package org.ok.milki.metadata.ui.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockServicesDataProvider implements ServicesDataProvider {

    @Override
    public int count() {
        return 80;
    }
}
