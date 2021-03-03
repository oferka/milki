package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/employees/employee-view-body.css")
public class EmployeeViewBody extends EntityViewBody {

    public EmployeeViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        super(idPrefix, entitiesViewName, entitiesNavigationTarget);
    }
}
