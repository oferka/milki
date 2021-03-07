package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;
import static org.ok.milki.metadata.ui.tools.ToolView.TOOL_ID_PREFIX;
import static org.ok.milki.metadata.ui.tools.ToolsView.TOOLS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TOOLS_ID_PREFIX + "/" + TOOL_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ToolViewBody extends EntityViewBody {

    public ToolViewBody() {
        super(TOOL);
    }
}
