package org.ok.milki.metadata.ui.positions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientPositionsDataProvider implements PositionsDataProvider {

    @Override
    public int count() {
        return 51;
    }
}
