package com.vyTrack.step_definitions;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.CarEntitlesPage;
import com.vyTrack.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US152_ExportGridDropdown_byTester {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    BasePage basePage = new BasePage();
    CarEntitlesPage carEntitlesPage = new CarEntitlesPage();


    /**
     * User Story: US152 As a Tester, When click on Export Grid dropdown, should see Csv and XLSX links
     *
     *   @Tester
     *   Scenario : Tester click "Export Grid" dropdown
     *     Given  User is logged as <Tester>
     *     When  User click  <Export Grid> dropdown at <CarEntitles> page
     *     Then  links CSV & XLSX  should be visible
     */

    @When("User click  <Export Grid> dropdown at <CarEntitles> page")
    public void userClickExportGridDropdownAtCarEntitlesPage() throws Exception {
        //5. hover over FLEET and click Vehicles
        basePage.hoverOver_toModule("fleet");
        basePage.click_SubModule_Fleet("vehicles");
        //7. wait for dropdown and click
        wait.until(ExpectedConditions.elementToBeClickable(carEntitlesPage.exportGridDropdown));
        carEntitlesPage.exportGridDropdown.click();
    }
}
