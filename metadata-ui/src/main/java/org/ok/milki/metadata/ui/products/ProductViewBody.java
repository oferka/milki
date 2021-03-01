package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/products/product-view-body.css")
public class ProductViewBody extends EntityViewBody {

    private final Label idLabel;

    public ProductViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("products", ProductsView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
