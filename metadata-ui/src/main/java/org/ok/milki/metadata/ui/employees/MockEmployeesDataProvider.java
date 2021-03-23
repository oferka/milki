package org.ok.milki.metadata.ui.employees;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MockEmployeesDataProvider implements EmployeesDataProvider {

    @Override
    public int count() {
        return 30;
    }
}
