package com.ast.step_definitions;

import com.ast.pages.DashboardPage;
import com.ast.pages.HeaderPage;
import com.ast.pages.LoginPage;
import com.ast.utilities.BrowserUtil;
import com.ast.utilities.ConfigurationReader;
import com.ast.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation_toCarEntitlesPage {

    /** GLOBAL Objects */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        DashboardPage dashboardPage = new DashboardPage();
        LoginPage loginPage = new LoginPage();
        HeaderPage headerPage = new HeaderPage();


    @When("User logging to the Dashboard System")
        public void user_logging_to_the_dashboard_system() throws InterruptedException {
            //1. Login as a testUser:
            loginPage.user_logging_toDashboardSystem();
            //2. verify the title
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardPage"));
        }

    @And("User selects Vehicles under Fleet")
        public void user_selects_vehicles_under_fleet() throws Exception {
            //3. navigate to Fleet, to Vehicles
            headerPage.hoverOver_MainMenu( "fleet" );
            headerPage.click_SubModule_Fleet( "vehicles" );
    }

    @Then("User should navigate to CarEntitles page")
        public void user_should_navigate_to_car_entitles_page() throws InterruptedException {
        //4. verify the title
        BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("vehiclesPage"));
    }


}
