package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.products.ProductView.PRODUCT_ID_PREFIX;
import static org.ok.milki.metadata.ui.products.ProductsView.PRODUCTS_ID_PREFIX;

@CssImport(STYLES_FOLDER + PRODUCTS_ID_PREFIX + "/" + PRODUCT_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class ProductViewBody extends EntityViewBody {

    public ProductViewBody() {
        super(PRODUCT);
    }
}
