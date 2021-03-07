package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.interviews.InterviewView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class InterviewView extends EntityView {

    public static final String ROUTE = "interviews";
    public static final String VIEW_NAME = "Interview";
    public static final String ID_PREFIX = "interview";

    @Override
    protected EntityType getEntityType() {
        return INTERVIEW;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new InterviewViewBody();
    }
}
