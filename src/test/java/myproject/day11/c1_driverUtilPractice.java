package myproject.day11;

import myproject.base.TestBase2;
import myproject.utilities.DriverUtil;
import myproject.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_driverUtilPractice extends TestBase2 {
    //go to Google
    //search for 'best city to celebrate New year"\
    //verify that title contains searchItem


    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox=DriverUtil.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(PropertiesReadingUtil.getProperties("search_item"));
        DriverUtil.getDriver().findElement(By.name("btnK")).click();

        String searchItem=PropertiesReadingUtil.getProperties("search_item");
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(searchItem));




    }


}
