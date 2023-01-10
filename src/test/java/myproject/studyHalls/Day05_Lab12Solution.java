package myproject.studyHalls;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Day05_Lab12Solution {
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab
    protected WebDriver driver;
    Set<String> tabs;

    @BeforeClass
    public void setUp(){
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown(){
        System.out.println("Test is completed");
        //driver.quit();
    }
    @Test(priority = 1)
    public void TC1_goUrl(){
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    }
    @Test(priority = 2, dependsOnMethods = {"TC1_goUrl"})
    public void TC2_clickTry(){
     driver.switchTo().frame("iframeResult");
     driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        Alert alert = driver.switchTo().alert();
        String text="Kadir";
        alert.sendKeys(text);
        alert.accept();
        WebElement textInput= driver.findElement(By.xpath("//p[@id='demo']"));
        Assert.assertEquals(textInput.getText(),"Hello "+text+"! How are you today?");
        //Assert.assertTrue(textInput.getText().contains(text));
    }
    @Test(priority = 3, dependsOnMethods = {"TC2_clickTry"})
    public void TC3_ClickHomeSign(){
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@id='tryhome']")).click();
    }
    @Test(priority = 4,dependsOnMethods = {"TC3_ClickHomeSign"})
    public void TC4_loginButton(){
        //w3loginbtn->id
      tabs=driver.getWindowHandles();
        for (String eachtab: tabs
             ) {
            driver.switchTo().window(eachtab);
        }
        System.out.println("Current title of the page" + driver.getTitle());
        driver.findElement(By.id("w3loginbtn")).click();

    }
    @Test(priority = 5,dependsOnMethods = {"TC4_loginButton"})
    public void TC5_switchToFirstTab(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("modalusername")).sendKeys("Kadir@test.ca");
        driver.findElement(By.id("current-password")).sendKeys("Password1");
        //driver.findElement(By.className("Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu")).click();
        tabs=driver.getWindowHandles();
        Iterator<String> iterator= tabs.iterator();
        String firstWindow= iterator.next();
        driver.switchTo().window(firstWindow);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"W3Schools Tryit Editor");


    }

    //email

}
