package myproject.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

}
