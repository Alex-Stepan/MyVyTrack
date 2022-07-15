package com.ast.step_definitions;

import com.ast.pages.CarEntitlesPage;
import com.ast.pages.HeaderPage;
import com.ast.pages.LoginPage;
import com.ast.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US151_ResetButton_StDf {

    /** GLOBAL Objects */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        CarEntitlesPage carEntitlesPage = new CarEntitlesPage();
        LoginPage loginPage = new LoginPage();
        HeaderPage headerPage = new HeaderPage();

    /** Scenario: TC4 Verification the click functionality of the "Reset" button */


    @When("select a few changes at <Grid settings>")
    public void select_a_few_changes_at_grid_settings() {
        //1. click Grid Settings Button
        wait.until(ExpectedConditions.elementToBeClickable(carEntitlesPage.gridSettingsButton));
        carEntitlesPage.gridSettingsButton.click();

        //2. wait until Grid settings dropdown will appear
        wait.until(ExpectedConditions.visibilityOf(carEntitlesPage.gridSetDropdown));

        //3. select Id
        carEntitlesPage.gridSet_Id.click();

        //4. unselect License Plate, Tags, Driver
        carEntitlesPage.gridSet_LicensePlate.click();
        carEntitlesPage.gridSet_Tags.click();
        carEntitlesPage.gridSet_Driver.click();

        //5. close Grid settings dropdown
        carEntitlesPage.gridSet_CloseButton.click();

        //6. wait until Grid settings dropdown closes
        wait.until(ExpectedConditions.invisibilityOf(carEntitlesPage.gridSetDropdown));
    }


    @When("see few changes to be applied")
    public void see_few_changes_to_be_applied() {
        //7. should appear Id column in Grid Header
        Assert.assertTrue(carEntitlesPage.gridHeader_Id.isDisplayed());
//        Assert.assertFalse(carEntitlesPage.gridHeader_LicensePlate.isDisplayed());
//        Assert.assertFalse(carEntitlesPage.gridHeader_Tags.isDisplayed());
//        Assert.assertFalse(carEntitlesPage.gridHeader_Driver.isDisplayed());

        //8. should disappear columns License Plate, Tags, Driver
    }

    @When("click  <Reset> button")
    public void click_reset_button() throws InterruptedException {
        carEntitlesPage.resetButton.click();
        Thread.sleep(3000);
    }

    @Then("selected changes at <Grid settings> should be reseted")
    public void selected_changes_at_grid_settings_should_be_reseted() {
//        wait.until(ExpectedConditions.invisibilityOf(carEntitlesPage.gridHeader_Id));
//        Assert.assertTrue("its not displayed", carEntitlesPage.gridHeader_Id.isDisplayed());
//        Assert.assertFalse("its displayed", carEntitlesPage.gridHeader_Id.isDisplayed());
        Assert.assertTrue(carEntitlesPage.gridHeader_LicensePlate.isDisplayed());
        Assert.assertTrue(carEntitlesPage.gridHeader_Tags.isDisplayed());
        Assert.assertTrue(carEntitlesPage.gridHeader_Driver.isDisplayed());

    }





    /** Scenario: TC3 Verification the click functionality of the "Refresh" button */
    @When("click <Refresh> button")
        public void click_refresh_button() {
            wait.until(ExpectedConditions.elementToBeClickable(carEntitlesPage.refreshButton));
            carEntitlesPage.refreshButton.click();
        }

    @Then("Vehicle Grid should be refreshed")
    public void vehicle_grid_should_be_refreshed() {

        Assert.assertTrue(carEntitlesPage.loadingElement.isDisplayed());
    }




}
