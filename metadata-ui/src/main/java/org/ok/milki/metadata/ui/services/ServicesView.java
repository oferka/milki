package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.services.ServicesView.ROUTE;
import static org.ok.milki.metadata.ui.services.ServicesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/services/services-view.css")
public class ServicesView extends HorizontalLayout {

    public static final String ROUTE = "services";
    public static final String VIEW_ID = "services-view";
    public static final String VIEW_NAME = "Services";
    public static final Icon VIEW_ICON = VaadinIcon.CLUSTER.create();

    public ServicesView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
