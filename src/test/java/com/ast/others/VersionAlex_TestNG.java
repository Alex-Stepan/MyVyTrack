package com.ast.others;

import com.ast.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class VersionAlex_TestNG {

    /** US 151 :
     *  As a user when I am on Vytrack => Fleet => Vehicles,
     *  I should be able to see Export Grid dropdown,
     *  Refresh, Reset and Grid Settings Buttons
     */

//    @Test
//    public void Given_User_on_CarEntitlesPage(){
//        /** Given  User navigates to "CarEntitles" page */
//        //1. create object module for using login functionality from T_Login_asUser class
//        Login_Functionality login_asUser = new Login_Functionality();
//
//        //2. implement login and navigate to Vehicles page
//        login_asUser.login_as_user();
//        login_asUser.navigate_to_VehiclesPage();
//    }
//
//    @Test(dependsOnMethods = {"Given_User_on_CarEntitlesPage"})
//    public void T1_click_functionality_of_ExportGrid_Dropdown() throws InterruptedException {
//        /**
//         * Feature: US 151
//         *      As a user when I am on Vytrack => Fleet => Vehicles,
//         *      I should be able to see Export Grid dropdown,
//         *      Refresh, Reset and Grid Settings Buttons
//         *
//         *  Scenario: T1 click functionality of Export Grid Dropdown
//         *      Given  User navigates to "CarEntitles" page
//         *
//         *      When  click "Export Grid" dropdown
//         *      Then  links CSV & XLSX should be visible
//         */
//
//        /** Given  User navigates to "CarEntitles" page */
//
//
//        /** When  click "Export Grid" dropdown */
//        //3. click on Export Grid dropdown, use method
//        WebElement exportGridDropdown =
//                Driver.getDriver().findElement(By.xpath("//div[@class='pull-left grid-toolbar-mass-actions']"));
//        exportGridDropdown.click();
//
//        /** Then  links CSV & XLSX should be visible */
//        //4. verify if CSV and XLSX dropdowns are visible
//        WebElement csvLink =
//                Driver.getDriver().findElement(By.xpath("//a[@data-key='csv']"));
//        WebElement xlsxLink =
//                Driver.getDriver().findElement(By.xpath("//a[@data-key='xlsx']"));
//
//        Assert.assertTrue(csvLink.isDisplayed(), "CSV link is not displayed - FAIL");
//        Assert.assertTrue(xlsxLink.isDisplayed(), "XLSX link is not displayed - FAIL");
//
//        Thread.sleep(2000);
//
//    }
//
//
//    @Test(dependsOnMethods = {"Given_User_on_CarEntitlesPage"})
//    public void T2_ExportGridDropdown_location() throws InterruptedException {
//        /**
//         * Feature: US 151
//         *      As a user when I am on Vytrack => Fleet => Vehicles,
//         *      I should be able to see Export Grid dropdown,
//         *      Refresh, Reset and Grid Settings Buttons
//         *
//         *  Scenario: T2 Export Grid Dropdown location
//         *      Given  User navigates to "CarEntitles" page
//         *
//         *      When  User is on  "Car-Entitles..."  page
//         *      Then  export grid should be visible on the left of the page
//         */
//
//
//        /** Given  User navigates to "CarEntitles" page */
//
//
//        /** When  User is on  "Car-Entitles..."  page */
//        exportGrid_isDisplayed();
//        vehiclesTitleVerify();
//
//
//        /** Then  export grid should be visible on the left of the page */
//        exportGridLocationVerify(Driver.getDriver(), "left");
//
//    }
//
//
//    @Test(dependsOnMethods = {"Given_User_on_CarEntitlesPage"})
//    public void T3_click_functionality_of_Refresh_Btn(){
//        /**
//         * Feature: US 151
//         *      As a user when I am on Vytrack => Fleet => Vehicles,
//         *      I should be able to see Export Grid dropdown,
//         *      Refresh, Reset and Grid Settings Buttons
//         *
//         *  TC3 Verification the click functionality of the "Refresh" button
//         *     Given  User navigates to "CarEntitles" page
//         *     When  click "Refresh" button
//         *     Then  Vehicle Grid should be refreshed
//         */
//
//
//        /** Given  User navigates to "CarEntitles" page */
//
//
//        /** When  click "Refresh" button */
//        // сlick on Refresh button
//        WebElement refreshBtn = Driver.getDriver().findElement(By.xpath("//i[@class='fa-repeat']"));
//        refreshBtn.click();
//
//        /** Then  Vehicle Grid should be refreshed */
//
//    }
//
//
//
//    @Test(dependsOnMethods = {"Given_User_on_CarEntitlesPage"})
//    public void T4_click_functionality_of_Reset_Btn() {
//        /**
//         * Feature: US 151
//         *      As a user when I am on Vytrack => Fleet => Vehicles,
//         *      I should be able to see Export Grid dropdown,
//         *      Refresh, Reset and Grid Settings Buttons
//         *
//         *  TC4 Verification the click functionality of the "Reset" button
//         *     Given  User navigates to "CarEntitles" page
//         *     When  apply changes to Grid header
//         *     And  click "Reset" button
//         *     Then  Vehicle Grid should be reseted
//         */
//
//
//        /** Given  User navigates to "CarEntitles" page */
//
//
//        /** When  apply changes to Grid header */
//        WebElement manageFiltersDropdown =
//                Driver.getDriver().findElement(By.xpath("//a[.='Manage filters']"));
//        manageFiltersDropdown.click();
//
//        WebElement checkBoxLicensePlate = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-0']"));
//        WebElement checkBoxTags = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-1']"));
//        WebElement checkBoxDriver = Driver.getDriver().findElement(By.xpath("//input[@id='ui-multiselect-0-0-option-2']"));
//        checkBoxLicensePlate.click();
//        checkBoxTags.click();
//        checkBoxDriver.click();
//
//        /** And  click "Reset" button */
//
//
//        /** hen  Vehicle Grid should be reseted */
//
//    }
//
//    /** METHODS: ---------------------------------------------------------------------- */
//
//    private void exportGridLocationVerify(WebDriver driver, String location) {
//        WebElement exportGridDropdown =
//                Driver.getDriver().findElement(By.xpath("//div[@class='pull-left grid-toolbar-mass-actions']"));
//
//
//        String expGridClassAttribute = exportGridDropdown.getAttribute("class");
//        Assert.assertTrue(expGridClassAttribute.contains(location),
//                "The attribute for Export Grid button does not has " + location + " indication for position - FAIL");
//    }
//
//
//    private void exportGrid_isDisplayed() {
//        WebElement exportGridDropdown =
//                Driver.getDriver().findElement(By.xpath("//div[@class='pull-left grid-toolbar-mass-actions']"));
//        Assert.assertTrue(exportGridDropdown.isDisplayed(), "Export Grid Dropdown is not displayed - FAIL");
//    }
//
//
//    private void vehiclesTitleVerify() throws InterruptedException {
//        wait(3000);
//        String actVehiclesTitle = Driver.getDriver().getTitle();
//        String expVehiclesTitle = "Car - Entities - System - Car - Entities - System";
//
//        Assert.assertEquals(actVehiclesTitle, expVehiclesTitle,
//                "Title for Car-Entitles... page does not match - FAIL");
//    }
//
//

}
