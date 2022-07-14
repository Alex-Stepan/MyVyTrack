package com.ast.step_definitions;

import com.ast.pages.CarEntitlesPage;
import com.ast.pages.DashboardPage;
import com.ast.pages.HeaderPage;
import com.ast.pages.LoginPage;
import com.ast.utilities.BrowserUtil;
import com.ast.utilities.ConfigurationReader;
import com.ast.utilities.Driver;
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
        LoginPage loginPage = new LoginPage();
        HeaderPage headerPage = new HeaderPage();


    @Given("User enters {string} with {string} to get to <CarEntitles> page")
    public void user_enters_with_to_get_to_car_entitles_page(String username, String password) throws Exception {
        //1. start from login
            Driver.getDriver().get(ConfigurationReader.getProperty("env"));
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("loginPage"));
        //2. login process
            loginPage.login_with_Valid_Credentials(username, password);
            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("dashboardPage"));
        //3. navigate to Fleet, to Vehicles
            headerPage.hoverOver_MainMenu( "fleet" );
            headerPage.click_SubModule_Fleet( "vehicles" );
        //4. verify title after navigation to Vehicles page
//            BrowserUtil.assertPageTitle(ConfigurationReader.getProperty("vehiclesPage"));


    }

    @When("click  <Export Grid> dropdown")
    public void click_export_grid_dropdown() {
        //5. click the Export Grid dropdown
            carEntitlesPage.exportGridDropdown.click();
    }

    @Then("links CSV & XLSX  should be visible")
    public void links_csv_xlsx_should_be_visible() {
        //6. verify if links appear
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

}
