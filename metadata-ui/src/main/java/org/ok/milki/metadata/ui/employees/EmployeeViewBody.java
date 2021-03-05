package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;

@CssImport("./styles/views/employees/employee-view-body.css")
public class EmployeeViewBody extends EntityViewBody {

    public EmployeeViewBody() {
        super(EMPLOYEE);
    }
}
