package myproject.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c4_CheckBox {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify checkbox1 is not selected
        //4. Click to checkbox2
        //5. Verify checkbox2 is selected

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //3. Verify checkbox1 is not selected
        WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));

        if(!checkBox1.isSelected()){
            System.out.println("checkbox1 is not selected, verification has passed");
        }else {
            System.out.println("checkbox1 is selected, verification has failed");
        }

        //4. Click to checkbox2
        WebElement checkBox2=driver.findElement(By.id("vfb-6-1"));
        checkBox2.click();

        //5. Verify checkbox2 is selected
        if(checkBox2.isSelected()){
            System.out.println("checkbox2 is selected, verification has passed");
        }else {
            System.out.println("checkbox2 is not selected, verification has failed");
        }

        Thread.sleep(2);
        driver.quit();



    }
}
