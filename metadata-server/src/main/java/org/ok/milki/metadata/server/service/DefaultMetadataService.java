package org.ok.milki.metadata.server.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Service
@Slf4j
@Validated
public class DefaultMetadataService implements MetadataService {

    private final String ROOT_MESSAGE = "Milki Metadata Root";

    @Override
    public @NotNull String getMessage() {
        return ROOT_MESSAGE;
    }
}
