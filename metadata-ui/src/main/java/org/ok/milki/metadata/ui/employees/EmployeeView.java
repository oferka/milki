package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.employees.EmployeeView.ROUTE;
import static org.ok.milki.metadata.ui.employees.EmployeeView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "employee-view.css")
public class EmployeeView extends EntityView {

    public static final String ROUTE = "employees";
    public static final String VIEW_NAME = "Employees";

    @Override
    protected String getIdPrefix() {
        return EMPLOYEE.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return EMPLOYEE.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return EMPLOYEE.getEntityViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return EMPLOYEE.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return EMPLOYEE.getEntityName();
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new EmployeeViewBody();
    }

    @Override
    protected String getEntitiesRoute() {
        return EMPLOYEE.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return EMPLOYEE.getEntitiesViewClass();
    }
}
