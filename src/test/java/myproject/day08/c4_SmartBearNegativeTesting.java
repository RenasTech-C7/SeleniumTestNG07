package myproject.day08;

import myproject.utilities.BrowserUtils;
import myproject.utilities.SmartBearUtils;
import myproject.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class c4_SmartBearNegativeTesting {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- enter incorrect username
    //4- enter wrong password
    //5- click login button
    //6- verify error message displayed :Invalid Login or Password.
    //Note : create another utils method under SmartBearUtil class called negativeLoginForSmartBear
    //this method should cover step3,4,5
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


    }
    @Test(dataProvider ="myLibraryData" )
    public void TC1_NegativeTest(String userID,String passwordID){
        BrowserUtils.wait(2);
        SmartBearUtils.negativeLoginforSmartBearUtil(driver,userID,passwordID);
    }

    @DataProvider(name = "myLibraryData")
    public static Object[][] invalidUserCredentials(){
        return new Object[][]{
                {"hasan","d999"},
                {"Ali","trabzon123"},
                {"",""},
                {"77777","==--0"},
                {"Fahrettin","Madox!@SpaceX"},
                {"Tester","test"}

        };
    }

}
