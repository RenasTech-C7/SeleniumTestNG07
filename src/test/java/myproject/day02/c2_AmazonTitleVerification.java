package myproject.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazonTitleVerification {
    public static void main(String[] args) {
        //Open Chrome Browser
        //Go to google
        //Navigate to https://www.amazon.com
        //Navigate back
        //Navigate forward
        //Verify title contains : Smile
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //Go to google
        driver.get("https://www.google.com/");
        //Navigate to https://www.amazon.com
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        //Navigate back
        driver.navigate().back();
        driver.manage().window().maximize();
        //Navigate forward
        driver.navigate().forward();

        //Verify title contains : Smile
        String expectedTitleWord="Smile";
        String actualTitle=driver.getTitle();

        if(actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile and verification has passed!");
        }else {
            System.out.println("Amazon title does not contain Smile and verification has failed!");
        }
        System.out.println("Actual Title is= "+driver.getTitle());

        driver.close();







    }
}
