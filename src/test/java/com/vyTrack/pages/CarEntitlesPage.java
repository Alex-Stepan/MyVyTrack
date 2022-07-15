package com.vyTrack.pages;

import com.vyTrack.utilities.Driver;
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
        @FindBy(xpath = "//div[contains(@class, 'left grid-toolbar')]//div[@class = 'btn-group']//a[contains(@class, 'dropdown-toggle')]")
                //      "//a[contains(@title,'export')]"
        public WebElement exportGridDropdown;

            @FindBy(xpath= "//ul//li//a[@title='CSV']")
            public WebElement csvLink;

            @FindBy(xpath="//ul//li//a[@title='XLSX']")
            public WebElement xlsxLink;

        @FindBy(xpath = "//a[@title='Reset'and contains(., 'Refresh')]")
        public WebElement refreshButton;

        @FindBy(xpath = "//a[@title='Reset']//i[@class='fa-refresh']")
                //a[@title='Reset'and contains(., 'Reset')]")
        public WebElement resetButton;

        @FindBy(xpath = "//div[@class='column-manager dropdown']//a[@title='Grid Settings']")
        public  WebElement gridSettingsButton;

            //Grid Settings Dropdown  begin
            @FindBy(xpath = "//div[@class='dropdown-menu']")
            public WebElement gridSetDropdown;


            @FindBy(xpath = "//table[@class='grid table-hover table table-condensed']//tbody//tr[contains(.,'Id')]//td[3]")
            public WebElement gridSet_Id;

            @FindBy(xpath = "//table[@class='grid table-hover table table-condensed']//tbody//tr[contains(.,'License Plate')]//td[3]")
            public WebElement gridSet_LicensePlate;

            @FindBy(xpath = "//table[@class='grid table-hover table table-condensed']//tbody//tr[contains(.,'Tags')]//td[3]")
            public WebElement gridSet_Tags;

            @FindBy(xpath = "//table[@class='grid table-hover table table-condensed']//tbody//tr[contains(.,'Driver')]//td[3]")
            public WebElement gridSet_Driver;


            @FindBy(xpath = "//div[@class='dropdown-menu']//span[@class='close']")
            public WebElement gridSet_CloseButton;
            //Grid Settings Dropdown  end


    //2.2. Grid Header
        @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//thead[@class='grid-header']//tr[@class='grid-header-row']//th//span[@class='grid-header-cell__label' and .='Id']")
        public WebElement gridHeader_Id;

        @FindBy(xpath = "//table//thead[@class='grid-header']//tr[@class='grid-header-row']//th//span[@class='grid-header-cell__label' and .='License Plate']")
        public WebElement gridHeader_LicensePlate;

        @FindBy(xpath = "//table//thead[@class='grid-header']//tr[@class='grid-header-row']//th//span[@class='grid-header-cell__label' and .='Tags']")
        public WebElement gridHeader_Tags;

        @FindBy(xpath = "//table//thead[@class='grid-header']//tr[@class='grid-header-row']//th//span[@class='grid-header-cell__label' and .='Driver']")
        public WebElement gridHeader_Driver;


    //2.3. Grid Table


    //2.4. Others

        @FindBy(xpath = "(//div[@class='loader-frame'])[1]")
        public WebElement loadingElement;



    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//
}
