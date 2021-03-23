package org.ok.milki.metadata.ui.teams;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockTeamsDataProvider implements TeamsDataProvider {

    @Override
    public int count() {
        return 90;
    }
}
