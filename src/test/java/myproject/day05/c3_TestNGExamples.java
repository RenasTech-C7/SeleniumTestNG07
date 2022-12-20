package myproject.day05;

import org.testng.Assert;
import org.testng.annotations.*;

public class c3_TestNGExamples {
    @BeforeClass
    public void setupBeforeClass(){ System.out.println("Before class is running"); }

    @AfterClass
    public void closingAfterClass(){ System.out.println("After class is running"); }

    @BeforeMethod
    public void setup(){ System.out.println("This is before method, it is running"); }

    @AfterMethod
    public void closing(){ System.out.println("This is after method, it is running"); }

    //in the below case; TC1 is depends on TC3, if TC3 passed, TC1 will be executed, if not TC1 will be ignored
    @Test(priority = 3,dependsOnMethods = "TC3")
    public void TC1(){
        System.out.println("test 1 is running");
    }

    @Test(priority = 1)
    public void TC3(){
        System.out.println("test 3 is running");
        int age1= 20;
        int age2=20;
        Assert.assertEquals(age1,age2,"age verification has failed");
    }

    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test 2 is running");
        String country1="USA";
        String country2="USA Hawaii";
        Assert.assertTrue(country2.contains(country1));
    }

    @Ignore
    @Test
    public void TC4(){
        System.out.println("Test 4 is running");
    }

}

