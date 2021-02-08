package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.teams.TeamsView.ROUTE;
import static org.ok.milki.metadata.ui.teams.TeamsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/teams/teams-view.css")
public class TeamsView extends HorizontalLayout {

    public static final String ROUTE = "teams";
    public static final String VIEW_ID = "teams-view";
    public static final String VIEW_NAME = "Teams";
    public static final Icon VIEW_ICON = VaadinIcon.GROUP.create();

    public TeamsView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
