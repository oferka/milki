package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/repositories/repositories-view-body.css")
public class RepositoriesViewBody extends EntitiesViewBody {

    public RepositoriesViewBody(String idPrefix) {
        super(idPrefix);
        add(new Text("repositories new"));
    }
}
