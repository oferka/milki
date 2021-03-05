package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.employees.EmployeesView.ROUTE;
import static org.ok.milki.metadata.ui.employees.EmployeesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class EmployeesView extends EntitiesView {

    public static final String ROUTE = "employees";
    public static final String VIEW_NAME = "Employees";

    @Override
    protected String getIdPrefix() {
        return EMPLOYEE.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return EMPLOYEE.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return EMPLOYEE.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return EMPLOYEE.getEntitiesViewDescription();
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
    protected EntitiesViewBody getViewBody() {
        return new EmployeesViewBody(EMPLOYEE.getEntitiesIdPrefix(), EMPLOYEE.getEntityName(), EMPLOYEE.getEntityViewClass());
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return EMPLOYEE.getEntityViewClass();
    }
}
