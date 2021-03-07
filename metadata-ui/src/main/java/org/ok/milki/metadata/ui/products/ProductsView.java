package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.products.ProductsView.*;

@Route(value = PRODUCTS_ROUTE, layout = MainView.class)
@PageTitle(PRODUCTS_VIEW_NAME)
@CssImport(STYLES_FOLDER + PRODUCTS_ID_PREFIX + "/" + PRODUCTS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ProductsView extends EntitiesView {

    public static final String PRODUCTS_ROUTE = "products";
    public static final String PRODUCTS_VIEW_NAME = "Products";
    public static final String PRODUCTS_ID_PREFIX = "products";

    @Autowired
    public ProductsView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return PRODUCT;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new ProductsViewBody();
    }
}
