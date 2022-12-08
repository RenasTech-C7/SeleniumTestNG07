package myproject.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_BrowserNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        //maximize browser page
        driver.manage().window().maximize();
        //get current title
        System.out.println("current title is = " +driver.getTitle());
        //get current url
        System.out.println("current url is="+driver.getCurrentUrl());

        //navigate to Tesla
        driver.get("https://www.tesla.com/");
        //get current title
        System.out.println("current title is = " +driver.getTitle());
        //to close browser page
        driver.close();

    }

}
