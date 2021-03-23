package org.ok.milki.metadata.ui.tools;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockToolsDataProvider implements ToolsDataProvider {

    @Override
    public int count() {
        return 100;
    }
}
