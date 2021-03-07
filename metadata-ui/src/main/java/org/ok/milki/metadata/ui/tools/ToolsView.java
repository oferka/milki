package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tools.ToolsView.*;


@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + "-view.css")
public class ToolsView extends EntitiesView {

    public static final String ROUTE = "tools";
    public static final String VIEW_NAME = "Tools";
    public static final String ID_PREFIX = "tools";

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ToolsViewBody();
    }
}
