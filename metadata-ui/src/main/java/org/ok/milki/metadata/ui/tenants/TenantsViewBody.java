package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.VIEW_ID_SUFFIX;
import static org.ok.milki.metadata.ui.tenants.TenantsView.TENANTS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TENANTS_ID_PREFIX + "/" + TENANTS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TenantsViewBody extends EntitiesViewBody {

    public TenantsViewBody() {
        super(TENANT);
    }
}
