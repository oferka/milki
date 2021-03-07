package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.VIEW_ID_SUFFIX;
import static org.ok.milki.metadata.ui.services.ServicesView.SERVICES_ID_PREFIX;

@CssImport(STYLES_FOLDER + SERVICES_ID_PREFIX + "/" + SERVICES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ServicesViewBody extends EntitiesViewBody {

    public ServicesViewBody() {
        super(SERVICE);
    }
}
