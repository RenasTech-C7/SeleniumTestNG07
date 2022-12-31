package myproject.day11;

import myproject.base.TestBase2;
import myproject.utilities.BrowserUtils;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_AlertPractice extends TestBase2 {

    /*
    Go to "http://the-internet.herokuapp.com/"
    click JavaScript Alerts
    Click for Js Prompt
    Enter "hello word" text
    Click okay
    Validate your text appearing on the page
         */
    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("herokuapp"));
        //click JavaScript Alerts
        WebElement jsAlertLink=DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAlertLink.click();
        //Click for Js Prompt
        WebElement jsAlertPromptLink=DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsAlertPromptLink.click();
        // Enter "hello word" text
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello World");
        BrowserUtils.wait(4);
        alert.accept();
        //Validate your text appearing on the page
        WebElement actualText=DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));




    }

}
