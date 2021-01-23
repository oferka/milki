package org.ok.milki.utils.id;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Service
@Slf4j
@Validated
public class DefaultIdGenerator implements IdGenerator {

    @Override
    public @NotNull @Size(min = 2, max = 64) @NotBlank String generate() {
        return UUID.randomUUID().toString();
    }
}
