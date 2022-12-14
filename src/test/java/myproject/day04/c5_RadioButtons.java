package myproject.day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c5_RadioButtons {
    public static void main(String[] args) {
        // Navigate to https://courses.letskodeit.com/practice
        // click on BMW RADIO button
        // verify that its selected
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        // click on BMW RADIO button
        WebElement BMWRadioButton=driver.findElement(By.id("bmwradio"));
        BMWRadioButton.click();
        if (BMWRadioButton.isSelected()){
            System.out.println(" bmwradio is selected, verification passed");
        }
        else {
            System.out.println(" bmwradio is not selected, verification failed");
        }

    }



}
