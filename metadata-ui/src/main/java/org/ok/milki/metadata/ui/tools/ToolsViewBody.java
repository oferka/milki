package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static java.lang.String.valueOf;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends EntitiesViewBody {

    public ToolsViewBody(String idPrefix) {
        super(idPrefix);
        addClassName("tools-view-body");

        for (int i = 1; i <= 10; i++) {
            add(new RouterLink("tool " + i, ToolView.class, valueOf(i)));
        }
    }
}
