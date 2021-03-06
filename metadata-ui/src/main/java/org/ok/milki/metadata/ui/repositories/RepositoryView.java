package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class RepositoryView extends EntityView {

    public static final String ROUTE = "repositories";
    public static final String VIEW_NAME = "Repository";
    public static final String ID_PREFIX = "repository";

    @Override
    protected EntityType getEntityType() {
        return REPOSITORY;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new RepositoryViewBody();
    }
}
