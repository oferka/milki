package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.COMPILE;
import static org.ok.milki.metadata.ui.products.ProductsView.ROUTE;
import static org.ok.milki.metadata.ui.products.ProductsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ProductsView extends EntitiesView {

    public static final String ROUTE = "products";
    public static final String VIEW_NAME = "Products";
    public static final String ENTITY_NAME ="Product";
    public static final String VIEW_DESCRIPTION ="Products view description";
    public static final VaadinIcon VIEW_ICON = COMPILE;

    @Override
    protected String getIdPrefix() {
        return ROUTE;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new ProductsViewBody();
    }
}
