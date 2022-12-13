package myproject.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_IDandXpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        //Search Christmas tree in Amazon
        //ID locator
        //ID is always unique
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Christmas Tree");

        //xpath locator: //tagname[@attribute='value']
        //click search button
       // driver.findElement(By.xpath("//input[@type='submit']")).click();


    }
}
