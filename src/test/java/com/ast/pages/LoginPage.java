package com.ast.pages;

import com.ast.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public WebElement submitButton;


    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//


}
