package myproject.day11;

import myproject.base.TestBase2;
import myproject.utilities.BrowserUtils;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class c3_actions extends TestBase2 {
    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up
    Actions actions;
    @Test
    public void TC1_double_click(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton=DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions=new Actions(DriverUtil.getDriver());
        //double click to double click button
        actions.doubleClick(doubleClickButton).perform();
        BrowserUtils.wait(2);
        //then accept the alert that pops up
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();

    }
    @Test
    public void TC2_rightClick(){
        //go to http://demo.guru99.com/test/simple_context_menu.html
        //right click to right click button
        //then click on edit button
        //then accept the alert that pops up
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99"));
        WebElement rightClickButton=DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        //right click to right click button
        actions=new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClickButton).perform();
        //then click on edit button
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();






    }
}
