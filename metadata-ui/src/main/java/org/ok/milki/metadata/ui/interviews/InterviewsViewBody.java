package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/interviews/interviews-view-body.css")
public class InterviewsViewBody extends EntitiesViewBody {

    public InterviewsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
    }
}
