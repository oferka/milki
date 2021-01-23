package org.ok.milki.model.utils.id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public interface Identifiable {

    @NotNull
    @Size(min = 2, max = 256)
    @NotBlank
    String getId();
}
