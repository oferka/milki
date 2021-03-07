package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityView.VIEW_ID_SUFFIX;
import static org.ok.milki.metadata.ui.tools.ToolView.TOOL_ID_PREFIX;
import static org.ok.milki.metadata.ui.tools.ToolView.TOOL_VIEW_NAME;
import static org.ok.milki.metadata.ui.tools.ToolsView.TOOLS_ID_PREFIX;
import static org.ok.milki.metadata.ui.tools.ToolsView.TOOLS_ROUTE;

@Route(value = TOOLS_ROUTE, layout = MainView.class)
@PageTitle(TOOL_VIEW_NAME)
@CssImport(STYLES_FOLDER + TOOLS_ID_PREFIX + "/" + TOOL_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ToolView extends EntityView {

    public static final String TOOL_VIEW_NAME = "Tool";
    public static final String TOOL_ID_PREFIX = "tool";

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ToolViewBody();
    }
}
