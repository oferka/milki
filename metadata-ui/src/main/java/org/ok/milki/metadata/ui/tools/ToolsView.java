package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.TOOLS;
import static org.ok.milki.metadata.ui.tools.ToolsView.ROUTE;
import static org.ok.milki.metadata.ui.tools.ToolsView.VIEW_NAME;


@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ToolsView extends EntitiesView {

    public static final String ROUTE = "tools";
    public static final String ID_PREFIX = "tools";
    public static final String VIEW_NAME = "Tools";
    public static final String ENTITY_NAME = "Tool";
    public static final String VIEW_DESCRIPTION ="Tools view description";
    public static final VaadinIcon VIEW_ICON = TOOLS;

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
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new ToolsViewBody();
    }
}
