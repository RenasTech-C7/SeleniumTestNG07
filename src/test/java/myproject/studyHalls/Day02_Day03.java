package myproject.studyHalls;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day02_Day03 {
    //Title is "ToolsQA"
    ///Current Url "https://demoqa.com/automation-practice-form"
    //verify title
    WebDriver driver;
    String url="https://demoqa.com/automation-practice-form";
    Faker faker = new Faker();
    By firstName = new By.ById("firstName");
    By lastName  = new By.ById("lastName");
    By email = new By.ById("userEmail");
    By gender = new By.ByXPath("//label[contains(text(),'Male')]");
    By phoneNumber = new By.ById("userNumber");
    By dob = new By.ById("dateOfBirthInput");
    By uploadFile = new By.ByCssSelector("#uploadPicture");
    @BeforeMethod
    public void lunchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifyTitleAndCurrentUrl(){
        String expectedTitle="ToolsQA";
        String expectedCurrentUrl="https://demoqa.com/automation-practice-form";
        String actualTitle=driver.getTitle();
        String actualCurrentUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedCurrentUrl,actualCurrentUrl);
    }

    @Test
    public void fillRegistrationForm(){
        driver.findElement(firstName).sendKeys(faker.name().firstName());
        driver.findElement(lastName).sendKeys(faker.name().lastName());
        driver.findElement(email).sendKeys(faker.internet().emailAddress());
        driver.findElement(gender).click();
        boolean isSelectedRadioButton=driver.findElement(gender).isSelected();
        if (isSelectedRadioButton){
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
        driver.findElement(phoneNumber).sendKeys(faker.phoneNumber().phoneNumber());
        String currentValue = driver.findElement(dob).getAttribute("value");
        System.out.println(currentValue);
        //I need to verify Value with current date
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);
        Assert.assertEquals(currentValue,currentDate);
        driver.findElement(uploadFile).sendKeys("/Users/aatug/Desktop/StudentPic.jpeg");

    }
}
