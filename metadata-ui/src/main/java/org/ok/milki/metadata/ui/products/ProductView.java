package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.PRODUCT;
import static org.ok.milki.metadata.ui.products.ProductView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class ProductView extends EntityView {

    public static final String ROUTE = "products";
    public static final String VIEW_NAME = "Product";
    public static final String ID_PREFIX = "product";

    @Override
    protected EntityType getEntityType() {
        return PRODUCT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ProductViewBody();
    }
}
