package com.ast.pages;

import com.ast.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */


    @FindBy(xpath = "(//span[@class='title title-level-1'][contains(.,'Fleet')]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;



    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//



}
