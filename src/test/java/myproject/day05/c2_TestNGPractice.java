package myproject.day05;

import org.testng.Assert;
import org.testng.annotations.*;

public class c2_TestNGPractice {
    @BeforeClass
    public void setupBeforeClass(){ System.out.println("Before class is running"); }

    @AfterClass
    public void closingAfterClass(){ System.out.println("After class is running"); }

    @BeforeMethod
    public void setup(){ System.out.println("This is before method, it is running"); }

    @AfterMethod
    public void closing(){ System.out.println("This is after method, it is running"); }


    @Test(priority = 3)
    public void TC1(){
        System.out.println("Test case 1 is running");
    }
    @Test(priority = 1)
    public void TC3(){
        System.out.println("Test 3 is running");

        String expectedBestDrink="coffee";
        String actualBestDrink="tea";
        Assert.assertEquals(expectedBestDrink,actualBestDrink,"Verification has failed");
        //if assertion is failed the rest of code block will not be executed!!!
        System.out.println("TC3 is done"); }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test 2 is running");
        String expectedBestFood="coxinha";
        String actualFood="coxinha";
        Assert.assertEquals(actualFood,expectedBestFood,"Food verification has failed");

    }

}
