package org.ok.milki.metadata.data;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.ui.EntityType;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import static java.lang.String.format;
import static org.apache.commons.lang3.RandomUtils.nextInt;

@Service
@Slf4j
public class MockEntityDataProvider implements EntityDataProvider {

    @Override
    public int count(@NotNull EntityType entityType) {
        log.info(format("Count for entity type: %s started", entityType.getEntityName()));
        int result = nextInt(0, 199);
        log.info(format("Count for entity type: %s completed. Result is: %s", entityType.getEntityName(), result));
        return result;
    }
}
