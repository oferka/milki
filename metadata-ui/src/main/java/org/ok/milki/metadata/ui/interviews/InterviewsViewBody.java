package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.INTERVIEWS_ID_PREFIX;

@CssImport(STYLES_FOLDER + INTERVIEWS_ID_PREFIX + "/" + INTERVIEWS_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class InterviewsViewBody extends EntitiesViewBody {

    public InterviewsViewBody() {
        super(INTERVIEW);
    }
}
