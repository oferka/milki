package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.SPECIALIST;
import static org.ok.milki.metadata.ui.interviews.InterviewView.ROUTE;
import static org.ok.milki.metadata.ui.interviews.InterviewView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "interview-view.css")
public class InterviewView extends EntityView {

    public static final String ROUTE = "interviews";
    public static final String ID_PREFIX = "interview";
    public static final String VIEW_NAME = "Interviews";
    public static final String ENTITY_NAME = "Interview";
    public static final String VIEW_DESCRIPTION ="Interview view description";
    public static final VaadinIcon VIEW_ICON = SPECIALIST;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new InterviewViewBody(getIdPrefix(), getViewName());
    }

    @Override
    protected String getEntitiesRoute() {
        return ROUTE;
    }
}
