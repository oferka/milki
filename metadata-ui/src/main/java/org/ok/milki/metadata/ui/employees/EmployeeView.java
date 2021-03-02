package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.HANDS_UP;
import static org.ok.milki.metadata.ui.employees.EmployeeView.ROUTE;
import static org.ok.milki.metadata.ui.employees.EmployeeView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "employee-view.css")
public class EmployeeView extends EntityView {

    public static final String ROUTE = "employees";
    public static final String ID_PREFIX = "employee";
    public static final String VIEW_NAME = "Employees";
    public static final String ENTITY_NAME = "Employee";
    public static final String VIEW_DESCRIPTION ="Employee view description";
    public static final VaadinIcon VIEW_ICON = HANDS_UP;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new EmployeeViewBody(getIdPrefix(), getViewName());
    }

    @Override
    protected String getEntitiesRoute() {
        return ROUTE;
    }
}
