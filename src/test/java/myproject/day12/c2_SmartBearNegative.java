package myproject.day12;

import com.github.javafaker.Faker;
import myproject.POMPages.SmartBearLoginPage;
import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_SmartBearNegative extends TestBase2 {
    //enter invalid credentials
    //verify that you get error message

    @Test
    public void TC1_invalidUserCredentials(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBearUrl"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        Faker faker=new Faker();
        smartBearLoginPage.loginForSmartBear(faker.name().username(),faker.internet().password());

        String expectedMessage="Invalid Login or Password.";
        String actualMessage=smartBearLoginPage.getStatusMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"verification has failed, user able to login");

    }

}
