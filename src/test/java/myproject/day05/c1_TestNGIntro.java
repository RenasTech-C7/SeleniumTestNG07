package myproject.day05;

import org.testng.annotations.*;

public class c1_TestNGIntro {

    /*
    @Test annotation:
	-> Which allows us to run those methods(tests) without main method.
     */
    //will run only one time before class
    @BeforeClass
    public void setupBeforeClass(){ System.out.println("Before class is running"); }
    //will run only one time after class
    @AfterClass
    public void closingAfterClass(){ System.out.println("After class is running"); }
    //will run before each test
    @BeforeMethod
    public void setup(){ System.out.println("This is before method, it is running"); }
    //will run after each test
    @AfterMethod
    public void closing(){ System.out.println("This is after method, it is running"); }
    //@Test is our main annotation which store main code
    @Test
    public void TC1(){ System.out.println("Test 1 is running"); }

    @Test
    public void TC2(){ System.out.println("Test 2 is running"); }







}
