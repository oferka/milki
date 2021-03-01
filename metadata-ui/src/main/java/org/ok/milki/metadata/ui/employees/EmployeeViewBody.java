package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/employees/employee-view-body.css")
public class EmployeeViewBody extends EntityViewBody {

    public EmployeeViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("employees", EmployeesView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
