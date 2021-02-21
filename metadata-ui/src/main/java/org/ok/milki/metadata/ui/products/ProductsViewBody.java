package org.ok.milki.metadata.ui.products;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/products/products-view-body.css")
public class ProductsViewBody extends VerticalLayout {

    public ProductsViewBody() {
        setId("products-view-body");
        add(new Text("products new"));
    }
}
