package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.tools.ToolsView.ROUTE;
import static org.ok.milki.metadata.ui.tools.ToolsView.VIEW_NAME;


@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ToolsView extends EntitiesView {

    public static final String ROUTE = "tools";
    public static final String VIEW_NAME = "Tools";

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ToolsViewBody();
    }
}
