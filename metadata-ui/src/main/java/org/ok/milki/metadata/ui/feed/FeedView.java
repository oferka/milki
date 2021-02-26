package org.ok.milki.metadata.ui.feed;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.LINES_LIST;
import static org.ok.milki.metadata.ui.feed.FeedView.ROUTE;
import static org.ok.milki.metadata.ui.feed.FeedView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class FeedView extends HorizontalLayout {

    public static final String ROUTE = "feed";
    public static final String VIEW_ID = "feed-view";
    public static final String VIEW_NAME = "Feed";
    public static final VaadinIcon VIEW_ICON = LINES_LIST;

    public FeedView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
