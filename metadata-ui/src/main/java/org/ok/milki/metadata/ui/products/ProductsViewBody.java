package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/products/products-view-body.css")
public class ProductsViewBody extends EntitiesViewBody {

    public ProductsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
        add(new Text("products new"));
    }
}
