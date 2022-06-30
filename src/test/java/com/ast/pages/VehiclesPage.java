package com.ast.pages;

import com.ast.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage {



    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */


    @FindBy(xpath = "//a[contains(@title,'export')]")
    public WebElement exportGridDropdown;

    @FindBy(css = "a[title='CSV']")
    public WebElement csvLink;

    @FindBy(css="XSLX")
    public WebElement xlsxLink;


    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//
}
