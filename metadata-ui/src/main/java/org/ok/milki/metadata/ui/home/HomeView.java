package org.ok.milki.metadata.ui.home;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.home.HomeView.ROUTE;
import static org.ok.milki.metadata.ui.home.HomeView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
@RouteAlias(value = "", layout = MainView.class)
public class HomeView extends HorizontalLayout {

    public static final String ROUTE = "home";
    public static final String VIEW_ID = "home-view";
    public static final String VIEW_NAME = "Home";
    public static final IconFactory VIEW_ICON = VaadinIcon.HOME_O;

    public HomeView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
