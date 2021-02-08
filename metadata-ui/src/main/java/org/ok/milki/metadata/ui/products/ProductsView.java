package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.products.ProductsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(ProductsView.VIEW_NAME)
@CssImport("./styles/views/products/products-view.css")
public class ProductsView extends EntitiesView {

    public static final String ROUTE = "products";
    public static final String VIEW_NAME = "Products";
    public static final String ENTITY_NAME ="Product";
    public static final Icon VIEW_ICON = VaadinIcon.COMPILE.create();

    @Override
    public String getIdPrefix() {
        return ROUTE;
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }
}
