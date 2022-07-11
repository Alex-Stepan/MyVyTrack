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

public class US151_RefreshButton_StDf {

    /** GLOBAL Objects */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        CarEntitlesPage carEntitlesPage = new CarEntitlesPage();
        LoginPage loginPage = new LoginPage();
        HeaderPage headerPage = new HeaderPage();


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
