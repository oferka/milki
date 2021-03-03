package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/interviews/interview-view-body.css")
public class InterviewViewBody extends EntityViewBody {

    public InterviewViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        super(idPrefix, entitiesViewName, entitiesNavigationTarget);
    }
}
