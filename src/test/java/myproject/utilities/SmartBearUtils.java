package myproject.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {
    public static void loginForSmartbearUtil(WebDriver driver){
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }
    public static void negativeLoginforSmartBearUtil(WebDriver driver,String userID,String passwordID){
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
    }

    public static void verifyStreet(WebDriver driver,String streetName){
        //to find the table //table[@='ctl00_MainContent_orderGrid']
        //to find all table row //table[@id='ctl00_MainContent_orderGrid']//tr


        List<WebElement> streetsList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
        for(WebElement eachStreet:streetsList){
            if(eachStreet.getText().equals(streetName)){
                Assert.assertTrue(eachStreet.getText().equals(streetName));
                return;
            }
        }
        Assert.fail("Street name:"+streetName+" is not present on the table");


    }

}
