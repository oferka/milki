package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.tools.ToolView;

import static java.lang.String.valueOf;

@CssImport("./styles/views/entities/entities-view-body.css")
public abstract class EntitiesViewBody extends VerticalLayout {

    public EntitiesViewBody(String idPrefix, String entityName) {
        setId(idPrefix + "-view-body");
        addClassName("entities-view-body");
        addClassName(idPrefix + "-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        for (int i = 1; i <= 10; i++) {
            add(new RouterLink(entityName + " " + i, ToolView.class, valueOf(i)));
        }
    }
}