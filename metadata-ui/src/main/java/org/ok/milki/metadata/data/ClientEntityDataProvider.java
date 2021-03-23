package org.ok.milki.metadata.data;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.ui.EntityType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

import static java.lang.String.format;

@Service
@Primary
@Slf4j
public class ClientEntityDataProvider implements EntityDataProvider {

    @Override
    public int count(@NotNull EntityType entityType) {
        log.info(format("Count for entity type: %s started", entityType.getEntityName()));
        int result = 0;
        switch (entityType) {
            case ACCOUNT -> result = 5;
            case EMPLOYEE -> result = 6;
            case INTERVIEW -> result = 7;
            case POSITION -> result = 8;
            case PRODUCT -> result = 9;
            case REPOSITORY -> result = 10;
            case SERVICE -> result = 11;
            case TEAM -> result = 12;
            case TENANT -> result = 13;
        }
        log.info(format("Count for entity type: %s completed. Result is: %s", entityType.getEntityName(), result));
        return result;
    }
}
