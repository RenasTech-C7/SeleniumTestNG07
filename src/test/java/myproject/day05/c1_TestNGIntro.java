package myproject.day05;

import org.testng.annotations.*;

public class c1_TestNGIntro {
    @BeforeClass
    public void setupBeforeClass(){ System.out.println("Before class is running"); }

    @AfterClass
    public void closingAfterClass(){ System.out.println("After class is running"); }

    @BeforeMethod
    public void setup(){ System.out.println("This is before method, it is running"); }

    @AfterMethod
    public void closing(){ System.out.println("This is after method, it is running"); }

    @Test
    public void TC1(){ System.out.println("Test 1 is running"); }

    @Test
    public void TC2(){ System.out.println("Test 2 is running"); }







}
