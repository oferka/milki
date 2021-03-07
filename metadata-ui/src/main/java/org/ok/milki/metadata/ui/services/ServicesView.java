package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.services.ServicesView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + "-view" + CSS_FILE_EXTENSION)
public class ServicesView extends EntitiesView {

    public static final String ROUTE = "services";
    public static final String VIEW_NAME = "Services";
    public static final String ID_PREFIX = "services";

    @Override
    protected EntityType getEntityType() {
        return SERVICE;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ServicesViewBody();
    }
}
