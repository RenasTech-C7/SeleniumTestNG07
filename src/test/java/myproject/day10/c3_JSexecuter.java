package myproject.day10;

import myproject.base.TestBase;
import myproject.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class c3_JSexecuter extends TestBase {

    @Test
    public void TC1_handling_windows(){
        driver.get("https://statefarm.com");

        ((JavascriptExecutor)driver).executeScript("window.open('https://tesla.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://youtube.com','_blank');");


    }

    @Test
    public void scrollDownUP(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("http://demo.guru99.com/test/guru99home/");
        js.executeScript("window.scrollBy(0,2000)");
        BrowserUtils.wait(5);
        js.executeScript("window.scrollBy(0,-2000)");

    }
}
          /*
        The syntax of ScrollBy() methods is :

        executeScript("window.scrollBy(x-pixels,y-pixels)");
        x-pixels is the number at x-axis,
        it moves to the left if number is positive and
        it move to the right if number is negative .

        y-pixels is the number at y-axis,
        it moves to the down if number is positive and
        it move to the up if number is in negative .
         */
