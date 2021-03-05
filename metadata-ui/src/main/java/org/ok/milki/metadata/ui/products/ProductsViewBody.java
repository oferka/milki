package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;

@CssImport("./styles/views/products/products-view-body.css")
public class ProductsViewBody extends EntitiesViewBody {

    public ProductsViewBody() {
        super(PRODUCT);
    }
}
