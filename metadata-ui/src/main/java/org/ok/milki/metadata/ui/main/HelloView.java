package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import static org.ok.milki.metadata.ui.main.HelloView.ROUTE;
import static org.ok.milki.metadata.ui.main.HelloView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/hello/hello-view.css")
public class HelloView extends HorizontalLayout {

    public static final String ROUTE = "hello";
    public static final String VIEW_ID = "hello-view";
    public static final String VIEW_NAME = "Hello";

    private final TextField name;
    private final Button sayHello;

    public HelloView() {
        setId(VIEW_ID);
        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        add(name, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
    }
}
