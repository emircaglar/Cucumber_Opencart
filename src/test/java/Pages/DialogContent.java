package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent {


    public DialogContent(){
        PageFactory.initElements(ErsteDriver.getDriver(),this);
    }

    @FindBy(id = "input-email")
    public WebElement input_username;

    @FindBy(id = "input-password")
    public WebElement input_password;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement login_button;

    @FindBy(id = "details-button")
    public WebElement cookies_button;

    @FindBy(id = "proceed-link")
    public WebElement cookies_button_weiter;

    @FindBy(css = "div[id='content']>h2")
    public WebElement my_account;


}
