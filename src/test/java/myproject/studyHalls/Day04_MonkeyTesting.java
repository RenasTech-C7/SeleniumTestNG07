package myproject.studyHalls;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Day04_MonkeyTesting {

    //Monkey Testing:You as an user click the functionalities randomly
    //you do not follow the steps. You try to break the app by clicking random links.
        //ul[data-ui='top-nav-category-list'] li a

@Test
public void monkeyTesting(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      List<WebElement> linkList = driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));

      int headerCount = linkList.size();
        System.out.println(headerCount);

        System.out.println();

        for (int i=0 ; i<headerCount; i++ ){
                int randomIndex = (int) Math.floor(Math.random() * headerCount);
                System.out.println(randomIndex);

                WebElement element = linkList.get(randomIndex);
                System.out.println(element.getText());
                element.click();
                driver.navigate().back();
                //element.click()
            /*If we use element.click() again, Selenium will not recognise and you'll get StaleElementReferenceException
            The reason for that you can not use same element when you navigate back Because it's counted as outdated.
            You need to declare that element again to avoid exception
            * */
                 linkList=driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));
        }
}



}
