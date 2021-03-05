package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.ROUTE;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class InterviewsView extends EntitiesView {

    public static final String ROUTE = "interviews";
    public static final String VIEW_NAME = "Interviews";

    @Override
    protected String getIdPrefix() {
        return INTERVIEW.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return INTERVIEW.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return INTERVIEW.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return INTERVIEW.getEntitiesViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return INTERVIEW.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return INTERVIEW.getEntityName();
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new InterviewsViewBody();
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return INTERVIEW.getEntityViewClass();
    }
}
