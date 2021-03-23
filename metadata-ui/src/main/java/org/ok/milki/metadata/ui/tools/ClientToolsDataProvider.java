package org.ok.milki.metadata.ui.tools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientToolsDataProvider implements ToolsDataProvider {

    @Override
    public int count() {
        return 101;
    }
}
