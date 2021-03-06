package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.employees.EmployeesView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class EmployeesView extends EntitiesView {

    public static final String ROUTE = "employees";
    public static final String VIEW_NAME = "Employees";
    public static final String ID_PREFIX = "employees";

    @Override
    protected EntityType getEntityType() {
        return EMPLOYEE;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new EmployeesViewBody();
    }
}
