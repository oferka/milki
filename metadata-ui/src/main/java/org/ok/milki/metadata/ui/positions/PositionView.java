package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.positions.PositionView.ROUTE;
import static org.ok.milki.metadata.ui.positions.PositionView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "position-view.css")
public class PositionView extends EntityView {

    public static final String ROUTE = "positions";
    public static final String VIEW_NAME = "Positions";

    @Override
    protected String getIdPrefix() {
        return POSITION.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return POSITION.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return POSITION.getEntityViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return POSITION.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return POSITION.getEntityName();
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new PositionViewBody();
    }

    @Override
    protected String getEntitiesRoute() {
        return POSITION.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return POSITION.getEntitiesViewClass();
    }
}
