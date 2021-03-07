package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;
import static org.ok.milki.metadata.ui.positions.PositionView.POSITION_ID_PREFIX;
import static org.ok.milki.metadata.ui.positions.PositionsView.POSITIONS_ID_PREFIX;

@CssImport(STYLES_FOLDER + POSITIONS_ID_PREFIX + "/" + POSITION_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class PositionViewBody extends EntityViewBody {

    public PositionViewBody() {
        super(POSITION);
    }
}
