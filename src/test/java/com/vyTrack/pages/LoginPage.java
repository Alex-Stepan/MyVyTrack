package com.vyTrack.pages;

import com.vyTrack.utilities.ConfigurationReader;
import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {


    //------------------------------------------------------//

    /** 1. Initialization of the page: */
        public LoginPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

    //------------------------------------------------------//


    /** 2. WebElements: */


        @FindBy (id = "prependedInput")
        public WebElement usernameBox;

        @FindBy (id="prependedInput2")
        public WebElement passwordBox;

        @FindBy (id = "_submit")
        public WebElement loginBtn;


    //------------------------------------------------------//


    /** 3. Methods: */

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);



        public void login_with_Valid_Credentials(String username, String password) {

            switch (username.toLowerCase()){
                case "truckdriver" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.TruckDriver2"));
                    passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
                    loginBtn.click();
                    wait.until(ExpectedConditions.titleContains(
                            ConfigurationReader.getProperty("dashboardPage")
                    ));
                    break;
                case "storemanager" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.StoreMan2"));
                    passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
                    loginBtn.click();
                    wait.until(ExpectedConditions.titleContains(
                            ConfigurationReader.getProperty("dashboardPage")
                    ));
                    break;
                case "salesmanager" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.SalesMan2"));
                    passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
                    loginBtn.click();
                    wait.until(ExpectedConditions.titleContains(
                            ConfigurationReader.getProperty("dashboardPage")
                    ));
                    break;
                default:
                    System.out.println("Please dont be an idiot, and provide correct username!");
            }

        }

    //------------------------------------------------------//

    public void user_logging_toDashboardSystem() {
        usernameBox.sendKeys(ConfigurationReader.getProperty("testUser"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
        wait.until(ExpectedConditions.titleContains(
                ConfigurationReader.getProperty("dashboardPage")
        ));
    }

    //------------------------------------------------------//


}
