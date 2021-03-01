package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/interviews/interview-view-body.css")
public class InterviewViewBody extends EntityViewBody {

    private final Label idLabel;

    public InterviewViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("interviews", InterviewsView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
