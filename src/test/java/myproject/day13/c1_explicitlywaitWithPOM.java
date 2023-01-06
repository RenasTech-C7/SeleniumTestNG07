package myproject.day13;

import myproject.POMPages.SeleniumPracticeHomePage;
import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_explicitlywaitWithPOM extends TestBase2 {
    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
// click on timer
// verify "WebDriver" text present
    @Test
    public void TC1_explicitlyWait(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage=new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        // verify "WebDriver" text present
        String actualText=seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(actualText,"WebDriver","Web Driver is not present");
        seleniumPracticeHomePage.getDefaultText();




    }


}
