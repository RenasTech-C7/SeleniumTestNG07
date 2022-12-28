package myproject.day09;

import myproject.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_windowsHandle extends TestBase {

    @Test
    public void TC1_multiWindows(){
        driver.get("https://renas-practice.herokuapp.com/selenium/elements");
        System.out.println("current Title is: "+driver.getTitle());
        driver.findElement(By.id("WindowsII")).click();
        WebElement openWindowButton=driver.findElement(By.id("open-window"));
        openWindowButton.click();

        Set<String> allWindows=driver.getWindowHandles(); //store all windows
        List<String> windowsList=new ArrayList<>();
        for(String NewWindow:allWindows){
            driver.switchTo().window(NewWindow);
            windowsList.add(NewWindow);
            System.out.println("current Title is: "+driver.getTitle());
        }

        //another method to switch windows
        driver.switchTo().window(windowsList.get(0));
        System.out.println("after switching current Title: "+driver.getTitle());
    }
}
