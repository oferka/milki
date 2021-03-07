package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.employees.EmployeeView.EMPLOYEE_ID_PREFIX;
import static org.ok.milki.metadata.ui.employees.EmployeesView.EMPLOYEES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;

@CssImport(STYLES_FOLDER + EMPLOYEES_ID_PREFIX + "/" + EMPLOYEE_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EmployeeViewBody extends EntityViewBody {

    public EmployeeViewBody() {
        super(EMPLOYEE);
    }
}
