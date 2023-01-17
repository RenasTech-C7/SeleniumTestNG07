package myproject.studyHalls;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Day06_ListenersTestNG.class)
public class day06_ListenersExample {



    public WebDriver driver;
    String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";

    @BeforeMethod
    public void lunch(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }
    @Test
    public void Test1(){
        System.out.println("Im inside Test1");
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Test
    public void Test2(){
        System.out.println("Im inside Test2");
        throw new SkipException("TestSkipped");
    }
    @Test
    public void Test3(){
        System.out.println("Im inside Test3");
        String text = driver.findElement(By.xpath("//a[contains(text(),'Score these trending kicks')]")).getText();
        Assert.assertEquals(text,"Failed");
    }
}
