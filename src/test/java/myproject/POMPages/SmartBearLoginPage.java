package myproject.POMPages;

import myproject.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
    public SmartBearLoginPage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }

    // @FindBy() annotation to locate web elements
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    private WebElement statusMessage;

    //Create methods related webelements

    public void loginForSmartBear(String username,String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public String getStatusMessage(){
        return statusMessage.getText();
    }



}
