package com.vyTrack.step_definitions;

import com.vyTrack.pages.CarEntitlesPage;
import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.LoginPage;
import com.vyTrack.utilities.BrowserUtil;
import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US151_ExportGridDropdown_StDf {

    /** GLOBAL Objects */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        CarEntitlesPage carEntitlesPage = new CarEntitlesPage();
        BasePage basePage = new BasePage();

    /**
     * @ExportGridFunctionality
     * Scenario Outline: T1. click functionality of "Export Grid" dropdown
     *   Given  User is logged as "<user>"
     *   When  User navigates to <CarEntitles> page
     *   And  click  <Export Grid> dropdown
     *   Then  links CSV & XLSX  should be visible
     *     Examples:
     *       | user         |
     *       | TruckDriver  |
     *       | StoreManager |
     *       | SalesManager |
     */

    @When("User navigates to <CarEntitles> page")
    public void user_navigates_to_car_entitles_page() throws Exception {
        //5. hover over FLEET and click Vehicles
            basePage.hoverOver_toModule("fleet");
            basePage.click_SubModule_Fleet("vehicles");
    }

    @And("click  <Export Grid> dropdown")
    public void click_export_grid_dropdown() {
        //7. wait for dropdown and click
            wait.until(ExpectedConditions.elementToBeClickable(carEntitlesPage.exportGridDropdown));
            carEntitlesPage.exportGridDropdown.click();
    }

    @Then("links CSV & XLSX  should be visible")
    public void links_csv_xlsx_should_be_visible() {
        //8. wait and assert links
            wait.until(ExpectedConditions.visibilityOf(carEntitlesPage.csvLink));
            wait.until(ExpectedConditions.visibilityOf(carEntitlesPage.xlsxLink));

            Assert.assertTrue(
                    "CSV Link is not displayed - FAIL",
                    carEntitlesPage.csvLink.isDisplayed()
            );

            Assert.assertTrue(
                    "XLSX Link is not displayed - FAIL",
                    carEntitlesPage.xlsxLink.isDisplayed()
            );
    }



    /**
     2. testUser <Export Grid> dropdown functionality
     @testUser
     Scenario : testUser click "Export Grid" dropdown on <CarEntitles> page
         Given  testUser is at <CarEntitles> page
         When  User click  <Export Grid> dropdown
         Then  links CSV & XLSX  should be visible
     */


}
