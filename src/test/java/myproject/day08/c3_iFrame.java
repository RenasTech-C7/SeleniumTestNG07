package myproject.day08;

import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_iFrame {
    //1- Open a chrome browser
    //2- Go to:http://the-internet.herokuapp.com/iframe
    //3- Switching by id or name attribute value.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void TC1_iframe(){
        //3- Switching by id or name attribute value.
        //if there is an iframe first switch to iframe
        //there are 3 ways to switch iframe: id/name, index, webelement
        driver.switchTo().frame(0);
        WebElement textbox=driver.findElement(By.id("tinymce"));
        textbox.clear();
        textbox.sendKeys("hello hasan");
        //in order to return main HTML code, use this:
        driver.switchTo().defaultContent();
        //in order to return previous frame use driver.switchTo().parentFrame();



    }

}
