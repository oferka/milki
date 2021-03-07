package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.positions.PositionsView.POSITIONS_ID_PREFIX;

@CssImport(STYLES_FOLDER + POSITIONS_ID_PREFIX + "/" + POSITIONS_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class PositionsViewBody extends EntitiesViewBody {

    public PositionsViewBody() {
        super(POSITION);
    }
}
