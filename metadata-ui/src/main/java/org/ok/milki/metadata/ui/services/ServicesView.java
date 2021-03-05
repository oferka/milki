package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.services.ServicesView.ROUTE;
import static org.ok.milki.metadata.ui.services.ServicesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ServicesView extends EntitiesView {

    public static final String ROUTE = "services";
    public static final String VIEW_NAME = "Services";

    @Override
    protected String getIdPrefix() {
        return SERVICE.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return SERVICE.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return SERVICE.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return SERVICE.getEntitiesViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return SERVICE.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return SERVICE.getEntityName();
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ServicesViewBody(SERVICE.getEntitiesIdPrefix(), SERVICE.getEntityName(), SERVICE.getEntityViewClass());
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return SERVICE.getEntityViewClass();
    }
}
