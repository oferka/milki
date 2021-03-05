package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.positions.PositionsView.ROUTE;
import static org.ok.milki.metadata.ui.positions.PositionsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class PositionsView extends EntitiesView {

    public static final String ROUTE = "positions";
    public static final String VIEW_NAME = "Positions";

    @Override
    protected EntityType getEntityType() {
        return POSITION;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new PositionsViewBody();
    }
}
