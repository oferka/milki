package org.ok.milki.metadata.ui.about;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.about.AboutView.ROUTE;
import static org.ok.milki.metadata.ui.about.AboutView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
public class AboutView extends Div {

    public static final String ROUTE = "about";
    public static final String VIEW_ID = "about-view";
    public static final String VIEW_NAME = "About";
    public static final Icon VIEW_ICON = VaadinIcon.EDIT.create();

    public AboutView() {
        setId(VIEW_ID);
        add(new Text(VIEW_NAME));
    }
}
