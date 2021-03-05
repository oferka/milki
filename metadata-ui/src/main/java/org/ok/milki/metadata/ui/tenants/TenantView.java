package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.tenants.TenantView.ROUTE;
import static org.ok.milki.metadata.ui.tenants.TenantView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "tenant-view.css")
public class TenantView extends EntityView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenants";

    @Override
    protected EntityType getEntityType() {
        return TENANT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TenantViewBody();
    }
}
