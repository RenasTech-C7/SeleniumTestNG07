package myproject.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_HelloSelenium {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //set up chrome driver
        WebDriverManager.chromedriver().setup();
        //create a driver instance
        WebDriver driver = new ChromeDriver();

        //navigate to chrome browser
        driver.get("https://www.google.com/");
        //go to amazon
        driver.get("https://www.amazon.com/");
    }
}