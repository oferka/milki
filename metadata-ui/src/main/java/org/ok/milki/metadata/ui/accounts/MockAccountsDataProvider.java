package org.ok.milki.metadata.ui.accounts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockAccountsDataProvider implements AccountsDataProvider {

    @Override
    public int count() {
        return 20;
    }
}
