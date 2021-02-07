package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.tenants.TenantsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(TenantsView.VIEW_NAME)
@CssImport("./styles/views/tenants/tenants-view.css")
public class TenantsView extends VerticalLayout {

    public static final String ROUTE = "tenants";
    public static final String VIEW_ID = "tenants-view";
    public static final String VIEW_NAME = "Tenants";
    public static final Icon VIEW_ICON = VaadinIcon.BUILDING_O.create();

    private final TenantsViewHeader tenantsViewHeader;

    public TenantsView() {
        setId(VIEW_ID);

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        tenantsViewHeader = new TenantsViewHeader();
        add(tenantsViewHeader);
    }
}
