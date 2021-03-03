package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/products/product-view-body.css")
public class ProductViewBody extends EntityViewBody {

    public ProductViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        super(idPrefix, entitiesViewName, entitiesNavigationTarget);
    }
}
