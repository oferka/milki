package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.accounts.AccountsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(AccountsView.VIEW_NAME)
@CssImport("./styles/views/accounts/accounts-view.css")
public class AccountsView extends HorizontalLayout {

    public static final String ROUTE = "accounts";
    public static final String VIEW_ID = "accounts-view";
    public static final String VIEW_NAME = "Accounts";
    public static final Icon VIEW_ICON = VaadinIcon.BUILDING_O.create();

    public AccountsView() {
        setId(VIEW_ID);
        setAlignItems(FlexComponent.Alignment.CENTER);

        Text text = new Text(VIEW_NAME);
        add(text);
    }
}
