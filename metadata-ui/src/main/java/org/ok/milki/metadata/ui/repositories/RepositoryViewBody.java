package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/repositories/repository-view-body.css")
public class RepositoryViewBody extends EntityViewBody {

    public RepositoryViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("repositories", RepositoriesView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
