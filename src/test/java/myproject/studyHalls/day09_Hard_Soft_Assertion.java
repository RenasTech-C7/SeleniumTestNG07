package myproject.studyHalls;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day09_Hard_Soft_Assertion {

    @Test
    public void TC1(){
        String expectedTitle="hello";
        String actualTitle="hello1";
        //Assert.assertEquals(expextedTitle,actualTitle);
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(expectedTitle,actualTitle);
        softAssert.assertEquals("hello","abd");
        String expectedUrl="www.google.com";
        String actualUrl="www.google.com";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Test
    public void tc2(){
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("hello","abd");
    }
}
