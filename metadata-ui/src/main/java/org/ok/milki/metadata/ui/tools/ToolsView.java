package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tools.ToolsView.*;


@Route(value = TOOLS_ROUTE, layout = MainView.class)
@PageTitle(TOOLS_VIEW_NAME)
@CssImport(STYLES_FOLDER + TOOLS_ID_PREFIX + "/" + TOOLS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ToolsView extends EntitiesView<ToolsDataProvider> {

    public static final String TOOLS_ROUTE = "tools";
    public static final String TOOLS_VIEW_NAME = "Tools";
    public static final String TOOLS_ID_PREFIX = "tools";

    public ToolsView(ToolsDataProvider entitiesDataProvider) {
        super(entitiesDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ToolsViewBody();
    }
}
