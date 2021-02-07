package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.products.ProductsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(ProductsView.VIEW_NAME)
@CssImport("./styles/views/products/products-view.css")
public class ProductsView extends HorizontalLayout {

    public static final String ROUTE = "products";
    public static final String VIEW_ID = "products-view";
    public static final String VIEW_NAME = "Products";
    public static final Icon VIEW_ICON = VaadinIcon.COMPILE.create();

    public ProductsView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
