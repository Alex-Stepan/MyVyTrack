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



// comment


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
    //------------------------------------------------------//


        public void login_with_Valid_Credentials(String username, String password) {
            //1. input username between 3 available options
            usernameBox.clear();
            usernameBox.sendKeys(ConfigurationReader.getProperty(username));
            //2. input password
            passwordBox.clear();
            passwordBox.sendKeys(ConfigurationReader.getProperty(password));
            //3. click on LOG IN button
            loginBtn.click();
            //4. wait until navigation to Dashboard page
            wait.until(ExpectedConditions.titleContains(
                    ConfigurationReader.getProperty("dashboardPage")
            ));
        }

    //------------------------------------------------------//
        public void login_with_parameters(String username) {
            //1. input username between 3 available options
            usernameBox.clear();
            switch (username.toLowerCase()){
                case "truckdriver" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.TruckDriver2"));
                    break;
                case "storemanager" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.StoreMan2"));
                    break;
                case "salesmanager" :
                    usernameBox.sendKeys(ConfigurationReader.getProperty("username.SalesMan2"));
                    break;
                default:
                    System.out.println("Please provide correct username!");
            }
            //2. input password
            passwordBox.clear();
            passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
            //3. click on LOG IN button
            loginBtn.click();
            //4. wait until navigation to Dashboard page
            wait.until(ExpectedConditions.titleContains(
                    ConfigurationReader.getProperty("dashboardPage")
            ));
        }




}
