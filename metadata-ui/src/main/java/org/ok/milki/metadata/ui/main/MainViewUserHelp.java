package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewUserHelp.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewUserHelp extends Button {

    public static final String VIEW_ID_SUFFIX = "main-view-user-help";

    public MainViewUserHelp() {
        setId(VIEW_ID_SUFFIX);

        Icon helpIcon = VaadinIcon.QUESTION_CIRCLE_O.create();
        setIcon(helpIcon);
        addClickListener(this::helpClicked);
    }

    private void helpClicked(ClickEvent<Button> event) {
        Notification.show("Help clicked", 3000, MIDDLE);
    }
}
