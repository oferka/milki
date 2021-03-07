package org.ok.milki.metadata.data;

import org.ok.milki.metadata.ui.EntityType;

import javax.validation.constraints.NotNull;

public interface EntityDataProvider {

    int count(@NotNull EntityType entityType);
}
