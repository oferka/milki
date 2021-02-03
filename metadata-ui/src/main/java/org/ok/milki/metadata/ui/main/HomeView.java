package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import static org.ok.milki.metadata.ui.main.HomeView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(HomeView.VIEW_NAME)
@CssImport("./styles/views/home/home-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class HomeView extends HorizontalLayout {

    public static final String ROUTE = "home";
    public static final String VIEW_ID = "home-view";
    public static final String VIEW_NAME = "Home";
    public static final Icon VIEW_ICON = VaadinIcon.HOME_O.create();

    public HomeView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
