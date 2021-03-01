package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityComponent;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.USER_CHECK;
import static org.ok.milki.metadata.ui.positions.PositionView.ROUTE;
import static org.ok.milki.metadata.ui.positions.PositionView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "position-view.css")
public class PositionView extends EntityView {

    public static final String ROUTE = "positions";
    public static final String ID_PREFIX = "position";
    public static final String VIEW_NAME = "Positions";
    public static final String ENTITY_NAME = "Position";
    public static final String VIEW_DESCRIPTION ="Position view description";
    public static final VaadinIcon VIEW_ICON = USER_CHECK;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityComponent getViewBody() {
        return new PositionViewBody();
    }
}
