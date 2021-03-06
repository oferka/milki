package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.tenants.TenantView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class TenantView extends EntityView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenant";
    public static final String ID_PREFIX = "tenant";

    @Override
    protected EntityType getEntityType() {
        return TENANT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TenantViewBody();
    }
}
