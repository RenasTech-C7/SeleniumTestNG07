package myproject.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_GoogleTitleVerification {
    public static void main(String[] args) {
        //1.Open Chrome Browser
        //2.Go to google
        //3.Verify title : Expected : Google
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2.Go to google
        driver.get("https://www.google.com/");

        //3.Verify title : Expected : Google
        boolean titleVerification=driver.getTitle().equals("Google");
        if(titleVerification){
            System.out.println("Google title verification has passed");
        }else {
            System.out.println("Google title verification has failed");
        }




    }
}
