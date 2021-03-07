package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TOOL;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tools.ToolsView.TOOLS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TOOLS_ID_PREFIX + "/" + TOOLS_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class ToolsViewBody extends EntitiesViewBody {

    public ToolsViewBody() {
        super(TOOL);
    }
}
