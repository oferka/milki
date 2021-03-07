package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.services.ServiceView.SERVICE_ID_PREFIX;
import static org.ok.milki.metadata.ui.services.ServicesView.SERVICES_ID_PREFIX;

@CssImport(STYLES_FOLDER + SERVICES_ID_PREFIX + "/" + SERVICE_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class ServiceViewBody extends EntityViewBody {

    public ServiceViewBody() {
        super(SERVICE);
    }
}
