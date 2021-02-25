package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityComponent;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.tools.ToolView.VIEW_NAME;
import static org.ok.milki.metadata.ui.tools.ToolsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "tool-view.css")
public class ToolView extends EntityView {

    public static final String ROUTE = "tools";
    public static final String VIEW_NAME = "Tool";
    public static final String ENTITY_NAME = "Tool";
    public static final String VIEW_DESCRIPTION ="Tool view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.TOOLS;

    @Override
    protected String getIdPrefix() {
        return VIEW_NAME;
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
    protected IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityComponent getViewBody() {
        return new ToolViewBody();
    }
}
