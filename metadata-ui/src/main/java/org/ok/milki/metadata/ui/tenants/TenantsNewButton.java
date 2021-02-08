package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_PRIMARY;
import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;

@CssImport("./styles/views/tenants/tenants-new-button.css")
public class TenantsNewButton extends Button {

    public TenantsNewButton() {
        setId("tenants-new-button");
        setIcon(VaadinIcon.PLUS.create());
        setText("New Tenant");
        addThemeVariants(LUMO_PRIMARY);
        addClickListener(this::newClicked);
        addClickShortcut(Key.KEY_N, KeyModifier.ALT);
    }

    private void newClicked(ClickEvent<Button> event) {
        Notification.show(event.toString(), 3000, MIDDLE);
    }
}
