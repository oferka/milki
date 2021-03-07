package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "employees/employee-view-body.css")
public class EmployeeViewBody extends EntityViewBody {

    public EmployeeViewBody() {
        super(EMPLOYEE);
    }
}
