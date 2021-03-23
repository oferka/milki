package org.ok.milki.metadata.ui.accounts;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@Slf4j
public class ClientAccountsDataProvider implements AccountsDataProvider {

    @Override
    public int count() {
        return 21;
    }
}
