package myproject.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_getText_Attribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));

        System.out.println("Gmail text is="+gmailLink.getText());
        System.out.println("Gmail class attribute value is="+gmailLink.getAttribute("class"));




    }
}
