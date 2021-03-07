package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "services/service-view-body" + CSS_FILE_EXTENSION)
public class ServiceViewBody extends EntityViewBody {

    public ServiceViewBody() {
        super(SERVICE);
    }
}
