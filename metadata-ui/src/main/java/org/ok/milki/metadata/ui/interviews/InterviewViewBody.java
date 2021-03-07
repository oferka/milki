package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;
import static org.ok.milki.metadata.ui.interviews.InterviewView.INTERVIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.INTERVIEWS_ID_PREFIX;

@CssImport(STYLES_FOLDER + INTERVIEWS_ID_PREFIX + "/" + INTERVIEW_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class InterviewViewBody extends EntityViewBody {

    public InterviewViewBody() {
        super(INTERVIEW);
    }
}
