package org.ok.milki.metadata.ui.employees;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.EMPLOYEE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.employees.EmployeesView.EMPLOYEES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entities.EntitiesView.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + EMPLOYEES_ID_PREFIX + "/" + EMPLOYEES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EmployeesViewBody extends EntitiesViewBody {

    public EmployeesViewBody() {
        super(EMPLOYEE);
    }
}
