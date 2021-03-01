package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/products/product-view-body.css")
public class ProductViewBody extends EntityViewBody {

    public ProductViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("products", ProductsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
