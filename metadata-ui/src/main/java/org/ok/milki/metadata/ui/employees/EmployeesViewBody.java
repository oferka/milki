package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;

@CssImport("./styles/views/employees/employees-view-body.css")
public class EmployeesViewBody extends EntitiesViewBody {

    public EmployeesViewBody() {
        super(EMPLOYEE);
    }
}
