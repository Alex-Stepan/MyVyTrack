package com.vyTrack.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    /** 1. Action Methods: */


    /** 2. Assertion Methods: */

    public static void assertPageTitle(String pageTitle) throws InterruptedException {
        //1.
            Thread.sleep( 3000 );
        //2.
            String actualTitle = Driver.getDriver().getTitle();
        //3. print out the actual title of the page
            System.out.println("actual title is: " + Driver.getDriver().getTitle());
        //4. assert if title is empty
            Assert.assertFalse(
                    "No Title - FAIL",
                    actualTitle.isEmpty()
            );
        //5. assert if title equals with expected
            //5.1.
                String newActualTitle = "";
            //5.2.
                if (actualTitle.startsWith("All - ")){
                    newActualTitle = actualTitle.substring(6);
                    System.out.println("\tnewActualTitle = " + newActualTitle);
                } else {
                    newActualTitle = actualTitle;
                }
            //5.3.
                Assert.assertEquals(
                        "Actual Title is different - FAIL",
                        pageTitle,
                        newActualTitle
                );
    }


    /** 3. Helping Methods: */

    public static void waitForInvisibilityOf(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));

    }








}
