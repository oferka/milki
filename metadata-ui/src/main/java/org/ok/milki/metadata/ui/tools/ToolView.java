package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.tools.ToolView.VIEW_NAME;
import static org.ok.milki.metadata.ui.tools.ToolsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "tool-view.css")
public class ToolView extends EntityView {

    public static final String ROUTE = "tools";
    public static final String VIEW_NAME = "Tools";

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ToolViewBody();
    }
}
