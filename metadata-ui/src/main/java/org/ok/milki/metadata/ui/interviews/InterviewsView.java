package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import static org.ok.milki.metadata.ui.EntityType.INTERVIEW;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.*;

@Route(value = INTERVIEWS_ROUTE, layout = MainView.class)
@PageTitle(INTERVIEWS_VIEW_NAME)
@CssImport(STYLES_FOLDER + INTERVIEWS_ID_PREFIX + "/" + INTERVIEWS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class InterviewsView extends EntitiesView {

    public static final String INTERVIEWS_ROUTE = "interviews";
    public static final String INTERVIEWS_VIEW_NAME = "Interviews";
    public static final String INTERVIEWS_ID_PREFIX = "interviews";

    @Autowired
    public InterviewsView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return INTERVIEW;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new InterviewsViewBody();
    }
}
