package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-user-help.css")
public class MainViewUserHelp extends Button {

    public MainViewUserHelp() {
        setId("main-view-user-help");

        Icon helpIcon = VaadinIcon.QUESTION_CIRCLE_O.create();
        setIcon(helpIcon);
        addClickListener(this::helpClicked);
    }

    private void helpClicked(ClickEvent<Button> event) {
        Notification.show("Help clicked", 3000, MIDDLE);
    }
}
