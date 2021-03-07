package org.ok.milki.metadata.ui;

import com.vaadin.flow.component.icon.VaadinIcon;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.ok.milki.metadata.ui.accounts.AccountView;
import org.ok.milki.metadata.ui.accounts.AccountsView;
import org.ok.milki.metadata.ui.employees.EmployeeView;
import org.ok.milki.metadata.ui.employees.EmployeesView;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.interviews.InterviewView;
import org.ok.milki.metadata.ui.interviews.InterviewsView;
import org.ok.milki.metadata.ui.positions.PositionView;
import org.ok.milki.metadata.ui.positions.PositionsView;
import org.ok.milki.metadata.ui.products.ProductView;
import org.ok.milki.metadata.ui.products.ProductsView;
import org.ok.milki.metadata.ui.repositories.RepositoriesView;
import org.ok.milki.metadata.ui.repositories.RepositoryView;
import org.ok.milki.metadata.ui.services.ServiceView;
import org.ok.milki.metadata.ui.services.ServicesView;
import org.ok.milki.metadata.ui.teams.TeamView;
import org.ok.milki.metadata.ui.teams.TeamsView;
import org.ok.milki.metadata.ui.tenants.TenantView;
import org.ok.milki.metadata.ui.tenants.TenantsView;
import org.ok.milki.metadata.ui.tools.ToolView;
import org.ok.milki.metadata.ui.tools.ToolsView;

import javax.validation.constraints.*;

import static com.vaadin.flow.component.icon.VaadinIcon.*;
import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.ok.milki.metadata.ui.accounts.AccountView.ACCOUNT_ID_PREFIX;
import static org.ok.milki.metadata.ui.accounts.AccountView.ACCOUNT_VIEW_NAME;
import static org.ok.milki.metadata.ui.accounts.AccountsView.*;
import static org.ok.milki.metadata.ui.employees.EmployeeView.EMPLOYEE_ID_PREFIX;
import static org.ok.milki.metadata.ui.employees.EmployeeView.EMPLOYEE_VIEW_NAME;
import static org.ok.milki.metadata.ui.employees.EmployeesView.*;

@ToString
@AllArgsConstructor
public enum EntityType {

    ACCOUNT (
            "Account",
            "Accounts",
            ACCOUNTS_ROUTE,
            ACCOUNTS_ID_PREFIX,
            ACCOUNT_ID_PREFIX,
            ACCOUNTS_VIEW_NAME,
            ACCOUNT_VIEW_NAME,
            "Accounts view description",
            "Account view description",
            CALC_BOOK,
            AccountsView.class,
            AccountView.class,
            nextInt(0, 100)
    ),
    EMPLOYEE (
            "Employee",
            "Employees",
            EMPLOYEES_ROUTE,
            EMPLOYEES_ID_PREFIX,
            EMPLOYEE_ID_PREFIX,
            EMPLOYEES_VIEW_NAME,
            EMPLOYEE_VIEW_NAME,
            "Employees view description",
            "Employee view description",
            HANDS_UP,
            EmployeesView.class,
            EmployeeView.class,
            nextInt(0, 100)
    ),
    INTERVIEW (
            "Interview",
            "Interviews",
            InterviewsView.INTERVIEWS_ROUTE,
            InterviewsView.INTERVIEWS_ID_PREFIX,
            InterviewView.INTERVIEW_ID_PREFIX,
            InterviewsView.INTERVIEWS_VIEW_NAME,
            InterviewView.INTERVIEW_VIEW_NAME,
            "Interviews view description",
            "Interview view description",
            SPECIALIST,
            InterviewsView.class,
            InterviewView.class,
            nextInt(0, 100)
    ),
    POSITION (
            "Position",
            "Positions",
            PositionsView.ROUTE,
            PositionsView.ID_PREFIX,
            PositionView.ID_PREFIX,
            PositionsView.VIEW_NAME,
            PositionView.VIEW_NAME,
            "Positions view description",
            "Position view description",
            USER_CHECK,
            PositionsView.class,
            PositionView.class,
            nextInt(0, 100)
    ),
    PRODUCT (
            "Product",
            "Products",
            ProductsView.ROUTE,
            ProductsView.ID_PREFIX,
            ProductView.ID_PREFIX,
            ProductsView.VIEW_NAME,
            ProductView.VIEW_NAME,
            "Products view description",
            "Product view description",
            COMPILE,
            ProductsView.class,
            ProductView.class,
            nextInt(0, 100)
    ),
    REPOSITORY (
            "Repository",
            "Repositories",
            RepositoriesView.ROUTE,
            RepositoriesView.ID_PREFIX,
            RepositoryView.ID_PREFIX,
            RepositoriesView.VIEW_NAME,
            RepositoryView.VIEW_NAME,
            "Repositories view description",
            "Repository view description",
            ROAD_SPLIT,
            RepositoriesView.class,
            RepositoryView.class,
            nextInt(0, 100)
    ),
    SERVICE (
            "Service",
            "Services",
            ServicesView.ROUTE,
            ServicesView.ID_PREFIX,
            ServiceView.ID_PREFIX,
            ServicesView.VIEW_NAME,
            ServiceView.VIEW_NAME,
            "Services view description",
            "Service view description",
            CLUSTER,
            ServicesView.class,
            ServiceView.class,
            nextInt(0, 100)
    ),
    TEAM (
            "Team",
            "Teams",
            TeamsView.ROUTE,
            TeamsView.ID_PREFIX,
            TeamView.ID_PREFIX,
            TeamsView.VIEW_NAME,
            TeamView.VIEW_NAME,
            "Teams view description",
            "Team view description",
            GROUP,
            TeamsView.class,
            TeamView.class,
            nextInt(0, 100)
    ),
    TENANT (
            "Tenant",
            "Tenants",
            TenantsView.ROUTE,
            TenantsView.ID_PREFIX,
            TenantView.ID_PREFIX,
            TenantsView.VIEW_NAME,
            TenantView.VIEW_NAME,
            "Tenants view description",
            "Tenant view description",
            BUILDING_O,
            TenantsView.class,
            TenantView.class,
            nextInt(0, 100)
    ),
    TOOL (
            "Tool",
            "Tools",
            ToolsView.ROUTE,
            ToolsView.ID_PREFIX,
            ToolView.ID_PREFIX,
            ToolsView.VIEW_NAME,
            ToolView.VIEW_NAME,
            "Tools view description",
            "Tool view description",
            TOOLS,
            ToolsView.class,
            ToolView.class,
            nextInt(0, 100)
    );

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entityName;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entitiesName;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String route;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entitiesIdPrefix;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entityIdPrefix;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entitiesViewName;

    @Getter
    @NotNull
    @Size(min = 2, max = 16)
    @NotBlank
    private final String entityViewName;

    @Getter
    @NotNull
    @Size(min = 2, max = 128)
    @NotBlank
    private final String entitiesViewDescription;

    @Getter
    @NotNull
    @Size(min = 2, max = 128)
    @NotBlank
    private final String entityViewDescription;

    @Getter
    @NotNull
    private final VaadinIcon entitiesViewIcon;

    @Getter
    @NotNull
    private final Class<? extends EntitiesView> entitiesViewClass;

    @Getter
    @NotNull
    private final Class<? extends EntityView> entityViewClass;

    @Getter
    @NotNull
    @Min(0)
    @Max(99)
    private final int entityCount;
}
