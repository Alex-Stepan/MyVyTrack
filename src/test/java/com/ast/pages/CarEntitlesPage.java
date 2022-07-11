package com.ast.pages;

import com.ast.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarEntitlesPage {



    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public CarEntitlesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */

    //2.1. Grid Toolbar
        @FindBy(xpath = "//a[contains(@title,'export')]")
        public WebElement exportGridDropdown;

        @FindBy(xpath= "//a[@title='CSV']")
        public WebElement csvLink;

        @FindBy(xpath="//a[@title='XLSX']")
        public WebElement xlsxLink;

            @FindBy(xpath = "//a[@title='Refresh']")
            public WebElement refreshButton;

    //2.2. Grid Header


    //2.3. Grid Table


    //2.4. Others

        @FindBy(xpath = "(//div[@class='loader-frame'])[1]")
        public WebElement loadingElement;



    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//
}
