package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;

@CssImport("./styles/views/interviews/interview-view-body.css")
public class InterviewViewBody extends EntityViewBody {

    public InterviewViewBody() {
        super(INTERVIEW);
    }
}
