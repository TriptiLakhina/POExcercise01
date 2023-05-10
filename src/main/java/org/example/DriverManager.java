package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
 //   @BeforeMethod
    public void openBrowser() {
        //Open Chrome browser
        driver = new ChromeDriver();
        //Open URL
        driver.get("https://demo.nopcommerce.com/");
        //Maximize the window
        driver.manage().window().maximize();
        //Implying implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

    }

//    @AfterMethod
    public void closeBrowser(){
        //Close the browser
        driver.close();

    }
}
