package com.vyTrack.step_definitions;

import com.vyTrack.pages.LoginPage;
import com.vyTrack.utilities.BrowserUtil;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US001_LoginFunctionality_stepDef {

    /** Global objects: */
        LoginPage loginPage = new LoginPage();


    /** 1. Verify all credentials for login functionality: */

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

//-------------------------------------------------------------------------------


    /** 2. testUser login functionality */

        @When("User login as a <Tester>")
        public void userLoginAsATester() {
            loginPage.login_with_parameters(ConfigurationReader.getProperty("testUser"));
        }


//-------------------------------------------------------------------------------

    /** 3. Login with Parameters */


        @When("User login as {string}")
        public void userLoginAs(String username) {
            //3. Login with parameters
            loginPage.login_with_parameters(username);
        }


    //-------------------------------------------------------------------------------

     /** 4. Logged as: */

    @Given("User is logged as {string}")
    public void user_is_logged_as(String username) throws InterruptedException {
        //1. start the WebDriver and get to Login page
            Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //2. verify that you are at Login page
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("loginPage"));
        //3. Login with parameters
            loginPage.login_with_parameters(username);
        //4. verify that you are at Dashboard page
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardPage"));
    }

    @Given("User is logged as <Tester>")
    public void userIsLoggedAsTestUser() throws InterruptedException {
        //1. start the WebDriver and get to Login page
            Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //2. verify that you are at Login page
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("loginPage"));
        //3. Login as testUser
            loginPage.login_with_parameters(ConfigurationReader.getProperty("testUser"));
        //4. verify that you are at Dashboard page
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardPage"));

    }

}
