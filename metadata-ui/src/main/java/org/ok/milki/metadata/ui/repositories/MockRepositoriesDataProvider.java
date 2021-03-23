package org.ok.milki.metadata.ui.repositories;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockRepositoriesDataProvider implements RepositoriesDataProvider {

    @Override
    public int count() {
        return 70;
    }
}
