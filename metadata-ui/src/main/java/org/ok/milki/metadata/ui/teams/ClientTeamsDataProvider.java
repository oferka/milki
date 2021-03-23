package org.ok.milki.metadata.ui.teams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientTeamsDataProvider implements TeamsDataProvider {

    @Override
    public int count() {
        return 91;
    }
}
