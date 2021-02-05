package org.ok.milki.metadata.ui.tenant;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.tenant.TenantView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(TenantView.VIEW_NAME)
@CssImport("./styles/views/tenant/tenant-view.css")
public class TenantView extends HorizontalLayout {

    public static final String ROUTE = "tenant";
    public static final String VIEW_ID = "tenant-view";
    public static final String VIEW_NAME = "Tenant";
    public static final Icon VIEW_ICON = VaadinIcon.BUILDING_O.create();

    public TenantView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
