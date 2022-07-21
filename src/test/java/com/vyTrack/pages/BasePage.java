package com.vyTrack.pages;

import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    /**------------------------------------------------------*/

    /** 1. Initialization of the page: */
        public BasePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

    /**------------------------------------------------------*/


    /** 2. WebElements: */
        //2.0. subTilte
            @FindBy(xpath = "//h1[contains(@class,'subtitle')]")
            public WebElement subTitle;

        //modulesListTruckDriver.toString() = [Fleet, Customers, Activities, System]

        // 2.1. Dashboard Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Dashboards' and contains(@class, title-level-1)]")
            public WebElement dashboardModule;


        // 2.2. FLEET Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Fleet' and contains(@class, title-level-1)]")
                    //      "//span[@class='title title-level-1'][contains(.,'Fleet')]")
            public WebElement fleetModule;

                @FindBy(xpath = "//span[.='Vehicles']")
                public WebElement fleet_vehicles;
                @FindBy(xpath = "//span[.='Vehicle Odometer']")
                public WebElement fleet_vehicleOdometer;
                @FindBy(xpath = "//span[.='Vehicle Costs']")
                public WebElement fleet_vehicleCosts;
                @FindBy(xpath = "//span[.='Vehicle Contracts']")
                public WebElement fleet_vehicleContracts;
                @FindBy(xpath = "//span[.='Vehicles Fuel Logs']")
                public WebElement fleet_vehiclesFuelLogs;
                @FindBy(xpath = "//span[.='Vehicle Services Logs']")
                public WebElement fleet_vehicleServiceLogs;
                @FindBy(xpath = "//span[.='Vehicles Model']")
                public WebElement fleet_vehiclesModel;


        // 2.3. CUSTOMERS Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Customers' and contains(@class, title-level-1)]")
            public WebElement customersModule;


        // 2.4. SALES Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Sales' and contains(@class, title-level-1)]")
            public WebElement salesModule;


        //2.5. ACTIVITIES Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Activities' and contains(@class, title-level-1)]")
            public WebElement activitiesModule;


        //2.6. MARKETING Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Marketing' and contains(@class, title-level-1)]")
            public WebElement marketingModule;


        //2.7. Reports & Segments Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'Reports & Segments' and contains(@class, title-level-1)]")
            public WebElement reportsAndSegmentsModule;


        //2.8. System Module
            @FindBy(xpath = "//a//span[normalize-space(text()) = 'System' and contains(@class, title-level-1)]")
            public WebElement systemModule;


        // DOT MENU Module */



        // USER MENU Module */
            @FindBy(xpath = "//a[@href='javascript: void(0);']")
            public WebElement userMenuDropdown;

            @FindBy(xpath = "//a[.='Logout']")
            public WebElement userLogoutLink;

        // OTHER LINKS */





    /** 3. Methods: ======================================== */
        //3.0. Global objects
        //3.1. Action Methods
        //3.2. Assertion Methods
        //3.3. Helping Methods

        /** 3.0. Global objects for methods */
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15 );

    /**------------------------------------------------------*/
    /** 3.1. Action Methods */
        public void user_Logout(){
            wait.until(ExpectedConditions.visibilityOf(userMenuDropdown));
            userMenuDropdown.click();
            wait.until(ExpectedConditions.visibilityOf(userLogoutLink));
            userLogoutLink.click();
        }

        // Module Select
        public void hoverOver_toModule(String moduleName) throws Exception {

            Actions action = new Actions( Driver.getDriver() );

            switch (moduleName.toLowerCase()) {
                case "dashboard":
                    wait.until( ExpectedConditions.visibilityOf( dashboardModule ) );
                    action.moveToElement( dashboardModule ).perform();
                    break;
                case "fleet":
                    wait.until( ExpectedConditions.visibilityOf( fleetModule ) );
                    action.moveToElement( fleetModule ).perform();
                    break;
                case "customer":
                    wait.until( ExpectedConditions.visibilityOf( customersModule ) );
                    action.moveToElement( customersModule ).perform();
                    break;
                case "sales":
                    wait.until( ExpectedConditions.visibilityOf( salesModule ) );
                    action.moveToElement( salesModule ).perform();
                    break;
                case "activities":
                    wait.until( ExpectedConditions.visibilityOf( activitiesModule ) );
                    action.moveToElement( activitiesModule ).perform();
                    break;
                case "marketing":
                    wait.until( ExpectedConditions.visibilityOf( marketingModule ) );
                    action.moveToElement( marketingModule ).perform();
                    break;
                case "reports and segments":
                    wait.until( ExpectedConditions.visibilityOf( reportsAndSegmentsModule ) );
                    action.moveToElement( reportsAndSegmentsModule ).perform();
                    break;
                case "system":
                    wait.until( ExpectedConditions.visibilityOf( systemModule ) );
                    action.moveToElement( systemModule ).perform();
                    break;

                default:
                    throw new Exception( "Unknown module name:" + moduleName );
            }
        }


        // Sub-Module Fleet Select
            public void click_SubModule_Fleet(String vehicleName) throws Exception {

                switch (vehicleName.toLowerCase()) {
                    case "vehicles":
                        wait.until( ExpectedConditions.visibilityOf(fleet_vehicles) );
                        fleet_vehicles.click();
                        break;
                    case "vehicle odometer":
                        wait.until( ExpectedConditions.visibilityOf( fleet_vehicleOdometer ) );
                        fleet_vehicleOdometer.click();
                        break;
                    case "vehicle costs":
                        wait.until( ExpectedConditions.visibilityOf( fleet_vehicleCosts ) );
                        fleet_vehicleCosts.click();
                        break;
                    case "vehicle contracts":
                        wait.until( ExpectedConditions.visibilityOf( fleet_vehicleContracts ) );
                        fleet_vehicleContracts.click();
                        break;
                    case "vehicles fuel logs":
                        wait.until( ExpectedConditions.visibilityOf(fleet_vehiclesFuelLogs) );
                        fleet_vehiclesFuelLogs.click();
                        break;
                    case "vehicle service logs":
                        wait.until( ExpectedConditions.visibilityOf( fleet_vehicleServiceLogs ) );
                        fleet_vehicleServiceLogs.click();
                        break;
                    case "vehicles model":
                        wait.until( ExpectedConditions.visibilityOf( fleet_vehiclesModel ) );
                        fleet_vehiclesModel.click();
                        break;

                    default:
                        throw new Exception( "Unknown submodule name:" + vehicleName );
                }
            }

        public void goTo_Fleet_CarEntitlesPage() {
            fleetModule.click();
            wait.until(ExpectedConditions.visibilityOf(fleet_vehicles));

            fleet_vehicles.click();
            wait.until(ExpectedConditions.titleContains(ConfigurationReader.getProperty("vehiclesPage")));

        }



    /**------------------------------------------------------*/
    /** 3.2. Assertion Methods */



//    public void clickDropdown(String dropdownName) throws Exception {
//
//        switch (dropdownName.toLowerCase()) {
//            case "export grid":
//                exportGrid.click();
//                break;
//            default:
//                throw new Exception( "Unknown dropdown name:" + dropdownName );
//        }
//    }
//
//    //endregion
//
//    // region Assertion

//    public void assertDropdownOption(String dropdownOptionName) throws Exception {
//
//        switch (dropdownOptionName.toLowerCase()) {
//            case "csv":
//                Assert.assertTrue( CSVdropdowmBtn.isDisplayed() );
//                break;
//            case "xlsx":
//                Assert.assertTrue( XLSXdropdownBtn.isDisplayed() );
//                break;
//            default:
//                throw new Exception( "Unknown dropdown option name:" + dropdownOptionName );
//        }
//
//    }
//
//    public void assertOneButtonIsLeftToAnother(String one, String two) {
//        int leftWebElement = 0;
//        int rightWebElement = 0;
//
//        for (WebElement eachFilter : listOfFilters) {
//            if (eachFilter.getAttribute( "title" ).equalsIgnoreCase( one )) {
//                leftWebElement= eachFilter.getLocation().getX();
//                System.out.println( "leftWebElement = " + leftWebElement );
//            }
//        }
//        for (WebElement eachFilter : listOfFilters) {
//            if (eachFilter.getAttribute( "title" ).equalsIgnoreCase( two )) {
//                rightWebElement= eachFilter.getLocation().getX();
//                System.out.println( "rightWebElement = " + rightWebElement );
//
//            }
//        }
//        Assert.assertTrue( "Test failed, check button position", leftWebElement< rightWebElement );
//    }

}
