package org.ok.milki.metadata.server.service;

import javax.validation.constraints.NotNull;

public interface MetadataService {

    @NotNull String getMessage();
}
