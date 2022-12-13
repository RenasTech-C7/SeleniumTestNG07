package myproject.day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c4_textmethod {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        driver.manage().window().maximize();
        //xpath text method: //tagname[.='text']
       // driver.findElement(By.xpath("//a[.='Software Testing']")).click();
        //absolute xpath
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/ul[1]/li[1]/a")).click();

    }



}
