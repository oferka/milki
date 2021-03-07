package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "interviews/interviews-view-body" + CSS_FILE_EXTENSION)
public class InterviewsViewBody extends EntitiesViewBody {

    public InterviewsViewBody() {
        super(INTERVIEW);
    }
}
