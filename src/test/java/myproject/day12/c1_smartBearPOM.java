package myproject.day12;

import myproject.POMPages.SmartBearLoginPage;
import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c1_smartBearPOM extends TestBase2 {

    @Test
    public void TC1_SmartBearPositiveTestVerification(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBearUrl"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginForSmartBear(PropertiesReadingUtil.getProperties("SmartBear_userName"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));
    }

}
