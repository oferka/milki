package org.ok.milki.metadata.ui.positions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockPositionsDataProvider implements PositionsDataProvider {

    @Override
    public int count() {
        return 50;
    }
}
