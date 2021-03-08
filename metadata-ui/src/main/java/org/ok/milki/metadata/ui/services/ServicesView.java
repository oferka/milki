package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.services.ServicesView.*;

@Route(value = SERVICES_ROUTE, layout = MainView.class)
@PageTitle(SERVICES_VIEW_NAME)
@CssImport(STYLES_FOLDER + SERVICES_ID_PREFIX + "/" + SERVICES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ServicesView extends EntitiesView {

    public static final String SERVICES_ROUTE = "services";
    public static final String SERVICES_VIEW_NAME = "Services";
    public static final String SERVICES_ID_PREFIX = "services";

    public ServicesView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return SERVICE;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ServicesViewBody();
    }
}
