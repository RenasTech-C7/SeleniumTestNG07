package myproject.day06;

import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_Smart_Bear_login {

    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click “Login” button
    //6- Verify title equals: Web Orders

    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @AfterMethod
    public void closing(){
       // driver.close();
    }
    @Test
    public void TC1_loginVerification(){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        //6- Verify title equals: Web Orders

        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();
        //Verify title equals: Web Orders
        String actualTitle=driver.getTitle();
        String expectedTitle="Web Orders";
        Assert.assertEquals(actualTitle,expectedTitle,"Title verification has failed!!!");
        System.out.println("title verification has passed");



    }
}
