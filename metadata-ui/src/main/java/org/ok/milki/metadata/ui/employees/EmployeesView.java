package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.interviews.InterviewsViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.employees.EmployeesView.ROUTE;
import static org.ok.milki.metadata.ui.employees.EmployeesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class EmployeesView extends EntitiesView {

    public static final String ROUTE = "employees";
    public static final String VIEW_NAME = "Employees";
    public static final String ENTITY_NAME ="Employee";
    public static final String VIEW_DESCRIPTION ="Employees view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.HANDS_UP;

    @Override
    protected String getIdPrefix() {
        return ROUTE;
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
    protected IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new EmployeesViewBody();
    }
}
