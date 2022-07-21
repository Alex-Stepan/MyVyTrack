package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.utilities.BrowserUtil;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.Handshake;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US154_SelectAllHeaderModulesAvailable_StDf {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    List<String> modulesListTruckDriver = new ArrayList<>();


    @When("Hover over to each module")
    public void hover_over_to_each_module() throws Exception {

        wait.until(ExpectedConditions.visibilityOf(basePage.fleetModule));
        actions.moveToElement(basePage.fleetModule).pause(2000).perform();
        Assert.assertTrue(basePage.fleetModule.isDisplayed());
        modulesListTruckDriver.add(basePage.fleetModule.getText());

        wait.until(ExpectedConditions.visibilityOf(basePage.customersModule));
        actions.moveToElement(basePage.customersModule).pause(2000).perform();
        Assert.assertTrue(basePage.customersModule.isDisplayed());
        modulesListTruckDriver.add(basePage.customersModule.getText());

        wait.until(ExpectedConditions.visibilityOf(basePage.activitiesModule));
        actions.moveToElement(basePage.activitiesModule).pause(2000).perform();
        Assert.assertTrue(basePage.activitiesModule.isDisplayed());
        modulesListTruckDriver.add(basePage.activitiesModule.getText());

        wait.until(ExpectedConditions.visibilityOf(basePage.systemModule));
        actions.moveToElement(basePage.systemModule).pause(2000).perform();
        Assert.assertTrue(basePage.systemModule.isDisplayed());
        modulesListTruckDriver.add(basePage.systemModule.getText());

    }



    @Then("All Modules and submodules should be visible for the module")
    public void allModulesAndSubmodulesShouldBeVisibleForTheModule() {
        System.out.println("modulesListTruckDriver.toString() = " + modulesListTruckDriver.toString());
    }


    //-------------------------------------------------------

    /**
     * Scenario Outline: Navigation to All SubModules from DASHBOARD Module
     *       Given User is logged as "<user>"
     *       When User navigates through each subModule from Dashboard Module
     *       Then Should acces each subModules from Dashboard Module
     *       Examples:
     *         | user         |
     *         | StoreManager |
     *         | SalesManager |
     */
    @When("User navigates through each subModule from Dashboard Module")
    public void user_navigates_through_each_sub_module_from_dashboard_module() throws Exception {

        //5. navigate to Fleet >> Table
            basePage.hoverOver_toModule("dashboards");
            basePage.click_SubModule_Dashboards("table");
        //6. assert the title actual with expected (from Configuration.Properties)
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardsTablePage"));

        //7. navigate to Fleet >> Dashboard
            basePage.hoverOver_toModule("dashboards");
            basePage.click_SubModule_Dashboards("dashboard");
        //8. assert the title actual with expected (from Configuration.Properties)
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardsDashboardPage"));

        //9. navigate to Fleet >> Manage Dashboards
            basePage.hoverOver_toModule("dashboards");
            basePage.click_SubModule_Dashboards("manage dashboards");
        //10. assert the title actual with expected (from Configuration.Properties)
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardsManageDashboardsPage"));

    }


    //-------------------------------------------------------





}
