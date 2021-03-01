package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.COMPILE;
import static org.ok.milki.metadata.ui.products.ProductView.ROUTE;
import static org.ok.milki.metadata.ui.products.ProductView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "product-view.css")
public class ProductView extends EntityView {

    public static final String ROUTE = "products";
    public static final String ID_PREFIX = "product";
    public static final String VIEW_NAME = "Products";
    public static final String ENTITY_NAME = "Product";
    public static final String VIEW_DESCRIPTION ="Product view description";
    public static final VaadinIcon VIEW_ICON = COMPILE;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new ProductViewBody(getIdPrefix());
    }
}
