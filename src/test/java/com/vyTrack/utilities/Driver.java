package com.vyTrack.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {


    /** needed to make coding shorter and easier without using TestBase and WebDriverFactory */

    //1.
        /** Creating a private constructor, we are closing access to the object of this class from outside the class */
        private Driver() {

        }

    //2.
        //Make WebDriver private, to close access from outside this class
        //Make it static, to use it in static method
        private static WebDriver driver;

    //3.
        /** Re-usable utility method which will return same driver instance when we call it */
        private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

        public static WebDriver getDriver() {



            if (driverPool.get() == null) {

                synchronized (Driver.class) {


                    String browserType = ConfigurationReader.getProperty("browser");

                    switch (browserType) {
                        case "chrome":
                            WebDriverManager.chromedriver().setup();
                            driverPool.set(new ChromeDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            driverPool.set(new FirefoxDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "opera":
                            WebDriverManager.operadriver().setup();
                            driverPool.set(new OperaDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "edge":
                            WebDriverManager.edgedriver().setup();
                            driverPool.set(new EdgeDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;
                        case "safari":
                            WebDriverManager.safaridriver().setup();
                            driverPool.set(new SafariDriver());
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                            break;

                    }
                }
            }

            return driverPool.get();

        }

        //        public static WebDriver getDriver(){
//
//            //4.
//                //it will check if driver is null, if it is null -> will set up the browser inside if statement
//            if (driver == null){
//
//                //5.
//                    //read browser type from configuration.properties using ConfigurationReader class and getProperty() method
//                String browserType = ConfigurationReader.getProperty("browser");
//
//
//                switch (browserType){
//                    case "chrome":
//                        WebDriverManager.chromedriver().setup();
//                        driver = new ChromeDriver();
//                        driver.manage().window().maximize();
//                        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                        break;
//
//                    case "firefox":
//                        WebDriverManager.firefoxdriver().setup();
//                        driver = new FirefoxDriver();
//                        driver.manage().window().maximize();
//                        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                        break;
//
//                    case "opera":
//                        WebDriverManager.operadriver().setup();
//                        driver = new OperaDriver();
//                        driver.manage().window().maximize();
//                        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                        break;
//
//                    case "edge":
//                        WebDriverManager.edgedriver().setup();
//                        driver = new EdgeDriver();
//                        driver.manage().window().maximize();
//                        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//                        break;
//
//                }
//            }
//
//            return driver;
//
//        }


        /** This method will make sure our driver value is always null after using quit() method */

        public static void closeDriver(){
            if(driverPool.get() != null){
                driverPool.get().quit(); // this line will terminate the existing driver session. with using this driver will not be even null
                driverPool.remove();
            }

        }
//        public static void closeDriver(){
//            if(driver != null){
//                driver.quit(); // this line will terminate the existing driver session. with using this driver will not be even null
//                driver = null;
//            }
//
//        }
//


}
