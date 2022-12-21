package myproject.day07;

import myproject.utilities.SmartBearUtils;
import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_SmartBearUtilPractice {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click “Login” button
    //6- Verify title equals: Web Orders

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @AfterMethod
    public void Closing(){
        driver.close();
    }

    @Test
    public void TC1_LoginForSmartBear(){
        SmartBearUtils.loginForSmartbearUtil(driver);
        //6- Verify title equals: Web Orders
        Assert.assertTrue(driver.getTitle().equals("Web Orders"),"Title verification has failed!!");

    }

}
