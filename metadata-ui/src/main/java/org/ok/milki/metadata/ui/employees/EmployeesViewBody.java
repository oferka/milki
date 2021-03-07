package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "employees/employees-view-body.css")
public class EmployeesViewBody extends EntitiesViewBody {

    public EmployeesViewBody() {
        super(EMPLOYEE);
    }
}
