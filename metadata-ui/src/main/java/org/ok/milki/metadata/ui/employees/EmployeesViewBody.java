package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/employees/employees-view-body.css")
public class EmployeesViewBody extends VerticalLayout {

    public EmployeesViewBody() {
        setId("employees-view-body");
        add(new Text("employees new"));
    }
}
