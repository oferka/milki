package org.ok.milki.metadata.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.ok.milki.metadata.server.service.MetadataService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MetadataController extends AbstractMetadataController {

    private final MetadataService metadataService;

    public MetadataController(@Autowired MetadataService metadataService) {
        this.metadataService = metadataService;
    }

    @GetMapping(path=EMPTY)
    public @NotNull ResponseEntity<String> getMessage() {
        return ResponseEntity.ok(metadataService.getMessage());
    }
}
