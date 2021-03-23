package org.ok.milki.metadata.ui.repositories;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.ui.entities.EntitiesDataProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientRepositoriesDataProvider implements RepositoriesDataProvider {

    @Override
    public int count() {
        return 71;
    }
}
