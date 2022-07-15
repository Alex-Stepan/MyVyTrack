package com.vyTrack.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    /** 1. Action Methods: */


    /** 2. Assertion Methods: */

    public static void assertPageTitle(String pageTitle) throws InterruptedException {
        Thread.sleep( 3000 );
        String title = Driver.getDriver().getTitle();

        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

            Assert.assertFalse(
                    "No Title - FAIL",
                    title.isEmpty()
            );

            Assert.assertEquals(
                    "Actual Title is different - FAIL",
                    pageTitle,
                    title
            );
    }


    /** 3. Helping Methods: */

    public static void waitForInvisibilityOf(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));

    }








}
