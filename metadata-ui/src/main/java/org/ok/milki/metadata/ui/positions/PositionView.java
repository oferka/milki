package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.POSITION;
import static org.ok.milki.metadata.ui.positions.PositionView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class PositionView extends EntityView {

    public static final String ROUTE = "positions";
    public static final String VIEW_NAME = "Position";
    public static final String ID_PREFIX = "position";

    @Override
    protected EntityType getEntityType() {
        return POSITION;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new PositionViewBody();
    }
}
