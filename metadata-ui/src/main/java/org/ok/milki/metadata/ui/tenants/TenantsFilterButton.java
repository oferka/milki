package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;

@CssImport("./styles/views/tenants/tenants-filter-button.css")
public class TenantsFilterButton extends Button {

    public TenantsFilterButton() {
        setId("tenants-filter-button");
        setIcon(VaadinIcon.FILTER.create());
        setText("Filter");
        addClickListener(this::filterClicked);
        addClickShortcut(Key.KEY_F, KeyModifier.ALT);
    }

    private void filterClicked(ClickEvent<Button> event) {
        Notification.show(event.toString(), 3000, MIDDLE);
    }
}
