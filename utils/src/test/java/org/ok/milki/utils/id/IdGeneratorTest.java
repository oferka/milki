package org.ok.milki.utils.id;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class IdGeneratorTest {

    @Autowired
    private IdGenerator idGenerator;

    @Test
    void generate() {
        String id = idGenerator.generate();
        log.info(id);
        assertNotNull(id);
    }
}