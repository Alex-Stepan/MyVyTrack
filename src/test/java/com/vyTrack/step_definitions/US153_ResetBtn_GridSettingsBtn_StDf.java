package com.vyTrack.step_definitions;

import com.vyTrack.pages.CarEntitlesPage;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US153_ResetBtn_GridSettingsBtn_StDf {

    /** GLOBAL Objects */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        CarEntitlesPage carEntitlesPage = new CarEntitlesPage();


    /**
     *  Scenario Outline: TC4 Verification the click functionality of the "Reset" button
     *     Given  User is logged as "<user>"
     *     When  User navigates to <CarEntitles> page
     *     And Apply a few changes at <Grid settings>
     *     Then  After clicking <Reset> button should be reseted selected changes at <Grid settings>
     *     Examples:
     *       | user         |
     *       | TruckDriver  |
     *       | StoreManager |
     *       | SalesManager |
     */

    @And("Apply a few changes at <Grid settings>")
    public void applyAFewChangesAtGridSettings() {
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
        //7. should appear Id column in Grid Header
            Assert.assertTrue(carEntitlesPage.gridHeader_Id.isDisplayed());
    }

    @Then("After clicking <Reset> button should be reseted selected changes at <Grid settings>")
    public void afterClickingResetButtonShouldBeResetedSelectedChangesAtGridSettings() {
        //8. click Reset button
            carEntitlesPage.resetButton.click();
        //9. verify that deselected columns appeared after reset
            Assert.assertTrue(carEntitlesPage.gridHeader_LicensePlate.isDisplayed());
            Assert.assertTrue(carEntitlesPage.gridHeader_Tags.isDisplayed());
            Assert.assertTrue(carEntitlesPage.gridHeader_Driver.isDisplayed());
    }
}
