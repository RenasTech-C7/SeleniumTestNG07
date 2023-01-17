package myproject.studyHalls;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class day08_BrokenLinks {

    WebDriver driver;

    @Test
    public void brokenLink() throws IOException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        int response;
        HttpURLConnection htt=null;

        String url="";

        driver.get("https://demoqa.com/broken");
         List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        System.out.println(alllinks.size());
        int expectedUrlSize=5;
        int actualUrlSize=alllinks.size();
        Assert.assertEquals(expectedUrlSize,actualUrlSize);

        Iterator<WebElement> iterator= alllinks.iterator();

        while (iterator.hasNext()){
            url=iterator.next().getAttribute("href");
           try {
               htt=(HttpURLConnection) (new URL(url).openConnection());
               htt.setRequestMethod("HEAD");
               htt.connect();
               response= htt.getResponseCode();
               if (response >= 400){
                   System.out.println(url+" is a broken link :" + response);
               }else {
                   System.out.println(url+" is a valid link :" + response);
               }
           }catch (IOException e){
               e.printStackTrace();
           }

        }
    }
}
