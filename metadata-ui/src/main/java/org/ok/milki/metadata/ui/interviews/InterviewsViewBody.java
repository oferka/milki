package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;

@CssImport("./styles/views/interviews/interviews-view-body.css")
public class InterviewsViewBody extends EntitiesViewBody {

    public InterviewsViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        super(idPrefix, entityName, entityNavigationTarget);
    }
}
