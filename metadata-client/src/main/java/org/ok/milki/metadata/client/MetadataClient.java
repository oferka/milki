package org.ok.milki.metadata.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.ok.milki.metadata.client.MetadataServerUriComponents.METADATA_ROOT_URL;
import static org.ok.milki.metadata.model.MetadataPaths.METADATA_PATH;

@FeignClient(value = METADATA_PATH, url = METADATA_ROOT_URL)
public interface MetadataClient {

    @GetMapping(value = EMPTY)
    ResponseEntity<String> getMessage();
}
