package myproject.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c3_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.vinexponewyork.com/");
        //we are giving driver a option to wait until page loadded
        //as soon as your web element load it will move on next step
        //it is not going to wait until giving time if page loaded
        //if this was thread.sleep no matter it will always wait until giving time
        //Implicit wait will effect all code block where we use it

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();

        driver.quit();




    }
}
