package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/employees/employee-view-body.css")
public class EmployeeViewBody extends EntityViewBody {

    private final Label idLabel;

    public EmployeeViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("employees", EmployeesView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
