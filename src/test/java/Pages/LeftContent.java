package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftContent {

    public LeftContent(){
        PageFactory.initElements(ErsteDriver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement adress_book;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement new_adress;

}

