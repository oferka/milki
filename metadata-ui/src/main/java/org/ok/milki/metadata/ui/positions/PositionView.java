package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.positions.PositionView.*;
import static org.ok.milki.metadata.ui.positions.PositionsView.POSITIONS_ID_PREFIX;
import static org.ok.milki.metadata.ui.positions.PositionsView.POSITIONS_ROUTE;

@Route(value = POSITIONS_ROUTE, layout = MainView.class)
@PageTitle(POSITION_VIEW_NAME)
@CssImport(STYLES_FOLDER + POSITIONS_ID_PREFIX + "/" + POSITION_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class PositionView extends EntityView {

    public static final String POSITION_VIEW_NAME = "Position";
    public static final String POSITION_ID_PREFIX = "position";

    @Override
    protected EntityType getEntityType() {
        return POSITION;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new PositionViewBody();
    }
}
