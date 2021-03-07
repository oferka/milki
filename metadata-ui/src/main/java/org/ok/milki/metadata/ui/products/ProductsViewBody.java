package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.VIEW_ID_SUFFIX;
import static org.ok.milki.metadata.ui.products.ProductsView.PRODUCTS_ID_PREFIX;

@CssImport(STYLES_FOLDER + PRODUCTS_ID_PREFIX + "/" + PRODUCTS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class ProductsViewBody extends EntitiesViewBody {

    public ProductsViewBody() {
        super(PRODUCT);
    }
}
