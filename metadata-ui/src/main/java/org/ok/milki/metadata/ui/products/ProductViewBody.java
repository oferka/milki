package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;

@CssImport("./styles/views/products/product-view-body.css")
public class ProductViewBody extends EntityViewBody {

    public ProductViewBody() {
        super(PRODUCT);
    }
}
