package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.employees.EmployeeView.*;
import static org.ok.milki.metadata.ui.employees.EmployeesView.EMPLOYEES_ID_PREFIX;
import static org.ok.milki.metadata.ui.employees.EmployeesView.EMPLOYEES_ROUTE;

@Route(value = EMPLOYEES_ROUTE, layout = MainView.class)
@PageTitle(EMPLOYEE_VIEW_NAME)
@CssImport(STYLES_FOLDER + EMPLOYEES_ID_PREFIX + "/" + EMPLOYEE_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EmployeeView extends EntityView {

    public static final String EMPLOYEE_VIEW_NAME = "Employee";
    public static final String EMPLOYEE_ID_PREFIX = "employee";

    @Override
    protected EntityType getEntityType() {
        return EMPLOYEE;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new EmployeeViewBody();
    }
}
