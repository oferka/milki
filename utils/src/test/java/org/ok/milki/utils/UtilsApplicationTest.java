package org.ok.milki.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class UtilsApplicationTest {

    @Test
    public void shouldLoadContext() {
        log.info("Loading context");
    }
}