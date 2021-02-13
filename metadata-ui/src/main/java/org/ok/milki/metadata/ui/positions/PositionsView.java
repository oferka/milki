package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.positions.PositionsView.ROUTE;
import static org.ok.milki.metadata.ui.positions.PositionsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class PositionsView extends EntitiesView {

    public static final String ROUTE = "positions";
    public static final String VIEW_NAME = "Positions";
    public static final String ENTITY_NAME ="Position";
    public static final String VIEW_DESCRIPTION ="Positions view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.USER_CHECK;

    @Override
    public String getIdPrefix() {
        return ROUTE;
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }

    @Override
    public String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    public IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }
}
