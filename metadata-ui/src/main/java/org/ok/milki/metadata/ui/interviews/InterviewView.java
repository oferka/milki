package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.interviews.InterviewView.ROUTE;
import static org.ok.milki.metadata.ui.interviews.InterviewView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "interview-view.css")
public class InterviewView extends EntityView {

    public static final String ROUTE = "interviews";
    public static final String VIEW_NAME = "Interviews";

    @Override
    protected EntityType getEntityType() {
        return INTERVIEW;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new InterviewViewBody();
    }
}
