package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/main/main-view-tab.css")
public class MainViewTab extends Tab {

    public MainViewTab(String id, String text, Class<? extends Component> navigationTarget) {
        setId(id);
        add(new RouterLink(text, navigationTarget));
        ComponentUtil.setData(this, Class.class, navigationTarget);
    }
}
