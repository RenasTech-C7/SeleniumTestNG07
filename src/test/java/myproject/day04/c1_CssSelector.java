package myproject.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //Css Selector
        //faster than xpath locator
        //# means id in CSS selector

        //first way
        //driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("home decor");

        //second way
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tea maker");




    }
}
