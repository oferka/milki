package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/repositories/repository-view-body.css")
public class RepositoryViewBody extends EntityViewBody {

    private final Label idLabel;

    public RepositoryViewBody() {
        setId("repository-view-body");
        add(new RouterLink("repositories", RepositoriesView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
