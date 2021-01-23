package org.ok.milki.utils.id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public interface IdGenerator {

    @NotNull @Size(min = 2, max = 64) @NotBlank String generate();
}
