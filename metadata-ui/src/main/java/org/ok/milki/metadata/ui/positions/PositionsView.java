package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.positions.PositionsView.*;

@Route(value = POSITIONS_ROUTE, layout = MainView.class)
@PageTitle(POSITIONS_VIEW_NAME)
@CssImport(STYLES_FOLDER + POSITIONS_ROUTE + "/" + POSITIONS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class PositionsView extends EntitiesView {

    public static final String POSITIONS_ROUTE = "positions";
    public static final String POSITIONS_VIEW_NAME = "Positions";
    public static final String POSITIONS_ID_PREFIX = "positions";

    @Override
    protected EntityType getEntityType() {
        return POSITION;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new PositionsViewBody();
    }
}
