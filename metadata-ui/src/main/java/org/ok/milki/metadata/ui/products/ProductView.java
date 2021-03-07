package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.products.ProductView.*;
import static org.ok.milki.metadata.ui.products.ProductsView.PRODUCTS_ID_PREFIX;
import static org.ok.milki.metadata.ui.products.ProductsView.PRODUCTS_ROUTE;

@Route(value = PRODUCTS_ROUTE, layout = MainView.class)
@PageTitle(PRODUCT_VIEW_NAME)
@CssImport(STYLES_FOLDER + PRODUCTS_ID_PREFIX + "/" + PRODUCT_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ProductView extends EntityView {

    public static final String PRODUCT_VIEW_NAME = "Product";
    public static final String PRODUCT_ID_PREFIX = "product";

    @Override
    protected EntityType getEntityType() {
        return PRODUCT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ProductViewBody();
    }
}
