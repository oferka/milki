package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.interviews.InterviewsView.ROUTE;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class InterviewsView extends EntitiesView {

    public static final String ROUTE = "interviews";
    public static final String VIEW_NAME = "Interviews";
    public static final String ENTITY_NAME ="Interview";
    public static final String VIEW_DESCRIPTION ="Interviews view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.SPECIALIST;

    @Override
    public String getIdPrefix() {
        return ROUTE;
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }

    @Override
    public String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    public IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }
}
