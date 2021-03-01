package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/products/products-view-body.css")
public class ProductsViewBody extends EntitiesViewBody {

    public ProductsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
    }
}
