package myproject.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class c1_Different_BrowsersSetUp {
    public static void main(String[] args) {
        //firefox Browser SetUp
        //WebDriverManager.firefoxdriver().setup();
       // WebDriver driver=new FirefoxDriver();
       // driver.get("https://www.google.com");

        //Edge Browser SetUp
       // WebDriverManager.edgedriver().setup();
       // WebDriver driver=new EdgeDriver();
       // driver.get("https://www.google.com");

        //safari set up
        WebDriverManager.safaridriver().setup();
        WebDriver driver=new SafariDriver();
        driver.get("https://www.google.com");

    }
}
