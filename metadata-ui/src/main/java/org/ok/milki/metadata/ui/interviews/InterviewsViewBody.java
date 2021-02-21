package org.ok.milki.metadata.ui.interviews;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/interviews/interviews-view-body.css")
public class InterviewsViewBody extends VerticalLayout {

    public InterviewsViewBody() {
        setId("interviews-view-body");
        add(new Text("interviews new"));
    }
}
