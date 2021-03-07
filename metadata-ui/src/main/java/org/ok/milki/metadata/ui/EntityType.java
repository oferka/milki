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
import static org.ok.milki.metadata.ui.interviews.InterviewView.INTERVIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.interviews.InterviewView.INTERVIEW_VIEW_NAME;
import static org.ok.milki.metadata.ui.interviews.InterviewsView.*;
import static org.ok.milki.metadata.ui.positions.PositionView.POSITION_ID_PREFIX;
import static org.ok.milki.metadata.ui.positions.PositionView.POSITION_VIEW_NAME;
import static org.ok.milki.metadata.ui.positions.PositionsView.*;
import static org.ok.milki.metadata.ui.products.ProductView.PRODUCT_ID_PREFIX;
import static org.ok.milki.metadata.ui.products.ProductView.PRODUCT_VIEW_NAME;
import static org.ok.milki.metadata.ui.products.ProductsView.*;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.*;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.REPOSITORY_ID_PREFIX;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.REPOSITORY_VIEW_NAME;
import static org.ok.milki.metadata.ui.services.ServiceView.SERVICE_ID_PREFIX;
import static org.ok.milki.metadata.ui.services.ServiceView.SERVICE_VIEW_NAME;
import static org.ok.milki.metadata.ui.services.ServicesView.*;
import static org.ok.milki.metadata.ui.teams.TeamView.TEAM_ID_PREFIX;
import static org.ok.milki.metadata.ui.teams.TeamView.TEAM_VIEW_NAME;
import static org.ok.milki.metadata.ui.teams.TeamsView.*;
import static org.ok.milki.metadata.ui.tenants.TenantView.TENANT_ID_PREFIX;
import static org.ok.milki.metadata.ui.tenants.TenantView.TENANT_VIEW_NAME;
import static org.ok.milki.metadata.ui.tenants.TenantsView.*;
import static org.ok.milki.metadata.ui.tools.ToolView.TOOL_ID_PREFIX;
import static org.ok.milki.metadata.ui.tools.ToolView.TOOL_VIEW_NAME;
import static org.ok.milki.metadata.ui.tools.ToolsView.*;

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
            INTERVIEWS_ROUTE,
            INTERVIEWS_ID_PREFIX,
            INTERVIEW_ID_PREFIX,
            INTERVIEWS_VIEW_NAME,
            INTERVIEW_VIEW_NAME,
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
            POSITIONS_ROUTE,
            POSITIONS_ID_PREFIX,
            POSITION_ID_PREFIX,
            POSITIONS_VIEW_NAME,
            POSITION_VIEW_NAME,
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
            PRODUCTS_ROUTE,
            PRODUCTS_ID_PREFIX,
            PRODUCT_ID_PREFIX,
            PRODUCTS_VIEW_NAME,
            PRODUCT_VIEW_NAME,
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
            REPOSITORIES_ROUTE,
            REPOSITORIES_ID_PREFIX,
            REPOSITORY_ID_PREFIX,
            REPOSITORIES_VIEW_NAME,
            REPOSITORY_VIEW_NAME,
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
            SERVICES_ROUTE,
            SERVICES_ID_PREFIX,
            SERVICE_ID_PREFIX,
            SERVICES_VIEW_NAME,
            SERVICE_VIEW_NAME,
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
            TEAMS_ROUTE,
            TEAMS_ID_PREFIX,
            TEAM_ID_PREFIX,
            TEAMS_VIEW_NAME,
            TEAM_VIEW_NAME,
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
            TENANTS_ROUTE,
            TENANTS_ID_PREFIX,
            TENANT_ID_PREFIX,
            TENANTS_VIEW_NAME,
            TENANT_VIEW_NAME,
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
            TOOLS_ROUTE,
            TOOLS_ID_PREFIX,
            TOOL_ID_PREFIX,
            TOOLS_VIEW_NAME,
            TOOL_VIEW_NAME,
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
