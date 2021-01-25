package org.ok.milki.metadata.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.ok.milki.metadata.model.MetadataPaths.METADATA_PATH;

@Slf4j
@RestController
@RequestMapping(path = METADATA_PATH)
public class MetadataController {

    public static final String ROOT_MESSAGE = "Milki Metadata Root";
    public static final String INVALID_REQUEST_ARGUMENT_REASON = "Request data validation error. The provided data violates the validation constraints";

    @GetMapping(path=EMPTY)
    public @NotNull ResponseEntity<String> getMessage() {
        return ResponseEntity.ok(ROOT_MESSAGE);
    }
}
