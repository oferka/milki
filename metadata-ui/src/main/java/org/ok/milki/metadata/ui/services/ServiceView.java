package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;
import static org.ok.milki.metadata.ui.services.ServiceView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class ServiceView extends EntityView {

    public static final String ROUTE = "services";
    public static final String VIEW_NAME = "Service";
    public static final String ID_PREFIX = "service";

    @Override
    protected EntityType getEntityType() {
        return SERVICE;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ServiceViewBody();
    }
}
