package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class InterviewsView extends EntitiesView {

    public static final String ROUTE = "interviews";
    public static final String VIEW_NAME = "Interviews";
    public static final String ID_PREFIX = "interviews";

    @Override
    protected EntityType getEntityType() {
        return INTERVIEW;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new InterviewsViewBody();
    }
}
