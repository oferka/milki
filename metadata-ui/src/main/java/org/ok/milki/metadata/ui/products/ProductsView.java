package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.products.ProductsView.ROUTE;
import static org.ok.milki.metadata.ui.products.ProductsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ProductsView extends EntitiesView {

    public static final String ROUTE = "products";
    public static final String VIEW_NAME = "Products";

    @Override
    protected EntityType getEntityType() {
        return PRODUCT;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ProductsViewBody();
    }
}
