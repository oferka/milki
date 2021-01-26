package org.ok.milki.metadata.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotNull;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MetadataClientTest {

    @Autowired
    private MetadataClient metadataClient;

    @Test
    public void shouldGetMessage() {
        ResponseEntity<String> message = metadataClient.getMessage();
        assertEquals(message.getStatusCode(), HttpStatus.OK);
    }
}