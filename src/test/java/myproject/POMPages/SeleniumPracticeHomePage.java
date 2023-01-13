package myproject.POMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SeleniumPracticeHomePage extends BasePage {
    @FindBy(xpath = "//button[@onclick='timedText()']")
    public WebElement timerButton;
    @FindBy(id = "demo")
    public WebElement defaultText;
    @FindBy(xpath = "//p[.='WebDriver']")
    public WebElement webDriverText;


    public void getDefaultText(){
        System.out.println("Default text="+defaultText.getText());
    }
    public WebElement getWebDriverText(){
        driverWait.until(ExpectedConditions.visibilityOf(webDriverText));
        return webDriverText;

    }

    public void clickTimerButton(){
        driverWait.until(ExpectedConditions.elementToBeClickable(timerButton)).click();
    }


}
