package myproject.day09;

import myproject.utilities.SmartBearUtils;
import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_WebTablePractice {

    WebDriver driver;
    @BeforeMethod
    public void Setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void TC1_Login(){
        SmartBearUtils.loginForSmartbearUtil(driver);
        //verify that we login to SmartBear
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test(dataProvider = "StreetDataLibrary")
    public void TC2_streetverification(String streetName){
        //Verify that given street exist on the web table
        SmartBearUtils.loginForSmartbearUtil(driver);
        SmartBearUtils.verifyStreet(driver,streetName);

    }

    @DataProvider(name="StreetDataLibrary")
    public static Object [][] test(){
        return new Object[][]{
                {"55, Washington ave"},
                {"17, Park Avenue"},
                {"3, Garden st."}


        };
    }
}
