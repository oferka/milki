package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;

@CssImport("./styles/views/entity/entity-share-button.css")
public class EntityShareButton extends Button {

    private final String idPrefix;

    public EntityShareButton(String idPrefix) {
        this.idPrefix = idPrefix;
        setId(idPrefix + "-share-button");
        addClassName("entity-share-button");

        setIcon(VaadinIcon.SHARE.create());
        setText("Share");
        addClickListener(this::shareClicked);
        addClickShortcut(Key.KEY_S, KeyModifier.ALT);
    }

    private void shareClicked(ClickEvent<Button> event) {
        Notification.show("Share " + idPrefix, 3000, MIDDLE);
    }
}
