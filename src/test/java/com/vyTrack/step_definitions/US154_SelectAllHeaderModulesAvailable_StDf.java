package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
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
}
