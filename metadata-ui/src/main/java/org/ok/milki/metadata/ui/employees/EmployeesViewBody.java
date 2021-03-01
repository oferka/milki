package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/employees/employees-view-body.css")
public class EmployeesViewBody extends EntitiesViewBody {

    public EmployeesViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
    }
}
