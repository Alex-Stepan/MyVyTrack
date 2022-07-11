package com.ast.step_definitions;

import com.ast.pages.HeaderPage;
import com.ast.pages.LoginPage;
import com.ast.utilities.BrowserUtil;
import com.ast.utilities.ConfigurationReader;
import com.ast.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunctionality_stepDef {

    /** Global objects: */
        LoginPage loginPage = new LoginPage();
        HeaderPage headerPage = new HeaderPage();


    /** Scenario Outline: */
        @Given("User is on VyTrack <Login> page")
            public void user_is_on_vy_track_login_page() throws InterruptedException {
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));
                BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("loginPage"));
            }

        @When("User enters {string} with {string}")
            public void user_enters_with(String username, String password) {
                loginPage.login_with_Valid_Credentials(username, password);
            }

        @Then("User should navigate to <Dashboard> page")
            public void user_should_navigate_to_dashboard_page() throws InterruptedException {
                BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardPage"));
            }

        @And("User logging out")
            public void user_logging_out() throws InterruptedException {
                headerPage.user_Logout();
                BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("loginPage"));
            }

}
