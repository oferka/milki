package org.ok.milki.metadata.ui.interviews;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientInterviewsDataProvider implements InterviewsDataProvider {

    @Override
    public int count() {
        return 41;
    }
}
