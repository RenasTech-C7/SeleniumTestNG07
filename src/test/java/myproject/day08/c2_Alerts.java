package myproject.day08;

import myproject.utilities.BrowserUtils;
import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_Alerts {
    //1- Open a chrome browser
    //2- Go to:https://renas-practice.herokuapp.com/home
    //click on elements
    //click on Alert Box
    //click button
    //handle alert
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://renas-practice.herokuapp.com/home");
    }
    @Test
    public void TC1_AlertPractice(){
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on Alert Box
        driver.findElement(By.id("Alert BoxI")).click();
        //click on "click me" alert button
        WebElement alertButton=driver.findElement(By.id("alert-demo"));
        alertButton.click();
        //handle alert
        //first we switch to Alert, then handle it
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(2);
        alert.accept();
        alertButton.click();
        BrowserUtils.wait(2);
        alert.dismiss();





    }
}
