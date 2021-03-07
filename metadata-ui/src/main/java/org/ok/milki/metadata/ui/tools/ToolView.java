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
import static org.ok.milki.metadata.ui.tools.ToolView.ID_PREFIX;
import static org.ok.milki.metadata.ui.tools.ToolView.VIEW_NAME;
import static org.ok.milki.metadata.ui.tools.ToolsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + "-view" + CSS_FILE_EXTENSION)
public class ToolView extends EntityView {

    public static final String ROUTE = "tools";
    public static final String VIEW_NAME = "Tool";
    public static final String ID_PREFIX = "tool";

    @Override
    protected EntityType getEntityType() {
        return TOOL;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ToolViewBody();
    }
}
