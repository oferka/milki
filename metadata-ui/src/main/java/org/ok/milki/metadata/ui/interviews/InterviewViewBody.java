package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/interviews/interview-view-body.css")
public class InterviewViewBody extends EntityViewBody {

    public InterviewViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("interviews", InterviewsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
