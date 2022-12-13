package myproject.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_LinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        //driver.manage().window().maximize();
        //click Gmail on the right top
        //used link text locator
        //driver.findElement(By.linkText("Gmail")).click();

        // used partial link text
        driver.findElement(By.partialLinkText("Gm")).click();

        //used classname locator
        //driver.findElement(By.className("gb_j")).click();

    }
}
