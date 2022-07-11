package com.ast.pages;

import com.ast.utilities.ConfigurationReader;
import com.ast.utilities.Driver;
import org.junit.Assert;
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
            usernameBox.sendKeys(ConfigurationReader.getProperty(username));
            passwordBox.sendKeys(ConfigurationReader.getProperty(password));
            loginBtn.click();
            wait.until(ExpectedConditions.titleContains(
                    ConfigurationReader.getProperty("dashboardPage")
            ));
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
