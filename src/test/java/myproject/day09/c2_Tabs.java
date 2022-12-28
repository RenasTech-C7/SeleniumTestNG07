package myproject.day09;

import myproject.base.TestBase;
import myproject.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    //oop concept, inheritance method

    @Test
    public void TC1_TabHandle(){
        //navigate to https://renas-practice.herokuapp.com/home
        //click on elements
        //click on windows
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on windows
        driver.findElement(By.id("WindowsII")).click();

        //this method will store current and only one window
        String currentWindow=driver.getWindowHandle();
        System.out.println("current window: "+currentWindow);
        System.out.println("current title: "+driver.getTitle());

        //click on open new tab button which is "click me"
        WebElement openTabButton=driver.findElement(By.id("open-tab"));
        openTabButton.click();

        System.out.println("current Title: "+driver.getTitle());

        Set<String> allTabs=driver.getWindowHandles(); //this method will store all tabs
        for (String tab:allTabs) {
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());

        }


    }

}
