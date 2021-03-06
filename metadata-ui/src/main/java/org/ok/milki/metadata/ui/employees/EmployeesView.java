package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.employees.EmployeesView.*;

@Route(value = EMPLOYEES_ROUTE, layout = MainView.class)
@PageTitle(EMPLOYEES_VIEW_NAME)
@CssImport(STYLES_FOLDER + EMPLOYEES_ID_PREFIX + "/" + EMPLOYEES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EmployeesView extends EntitiesView<EmployeesDataProvider> {

    public static final String EMPLOYEES_ROUTE = "employees";
    public static final String EMPLOYEES_VIEW_NAME = "Employees";
    public static final String EMPLOYEES_ID_PREFIX = "employees";

    public EmployeesView(EmployeesDataProvider entitiesDataProvider) {
        super(entitiesDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return EMPLOYEE;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new EmployeesViewBody();
    }
}
