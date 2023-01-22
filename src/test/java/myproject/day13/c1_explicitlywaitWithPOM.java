package myproject.day13;

import myproject.POMPages.SeleniumPracticeHomePage;
import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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

    @Test
    public void TC1() {

        int empty=0;
        int notEmpty=0;
        DriverUtil.getDriver().get(" https://www.guru99.com/software-testing.html");
        List<WebElement> list=DriverUtil.getDriver().findElements(By.xpath("//li[@id='menu-item-3173']/ul/li/a"));
        for (WebElement alllinks:list) {
            String elementText=alllinks.getText();
            if (elementText.isEmpty()){
                empty++;
            }
            else{
                notEmpty++;
            }
            System.out.println(alllinks.getText());
            System.out.println(elementText);
        }
        System.out.println(empty);
        System.out.println(notEmpty);
        DriverUtil.getDriver().findElement(By.xpath("//li[@id='menu-item-4569']/a")).getText();

        //class is done

    }


}
