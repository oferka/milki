package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.services.ServiceView.*;
import static org.ok.milki.metadata.ui.services.ServicesView.SERVICES_ID_PREFIX;

@Route(value = SERVICES_ID_PREFIX, layout = MainView.class)
@PageTitle(SERVICE_VIEW_NAME)
@CssImport(STYLES_FOLDER + SERVICES_ID_PREFIX + "/" + SERVICE_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ServiceView extends EntityView {

    public static final String SERVICE_VIEW_NAME = "Service";
    public static final String SERVICE_ID_PREFIX = "service";

    @Override
    protected EntityType getEntityType() {
        return SERVICE;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ServiceViewBody();
    }
}
