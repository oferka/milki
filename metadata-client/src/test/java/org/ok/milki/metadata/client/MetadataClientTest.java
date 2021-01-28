package org.ok.milki.metadata.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MetadataClientTest {

    @Autowired
    private MetadataClient metadataClient;

    @Test
    public void shouldGetMessage() {
//        ResponseEntity<String> message = metadataClient.getMessage();
//        assertEquals(message.getStatusCode(), HttpStatus.OK);
    }
}