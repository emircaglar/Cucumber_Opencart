package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DialogContent {


    public DialogContent() {
        PageFactory.initElements(ErsteDriver.getDriver(), this);
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

    @FindBy(name = "firstname")
    public WebElement first_name;

    @FindBy(name = "lastname")
    public WebElement last_name;

    @FindBy(name = "address_1")
    public WebElement address_1;

    @FindBy(id = "input-city")
    public WebElement input_city;

    @FindBy(id = "input-postcode")
    public WebElement input_postcode;

    @FindBy(id = "input-country")
    public WebElement input_country;

    @FindBy(id = "input-zone")
    public WebElement input_zone;

    @FindBy(css = "select[id='input-zone']>option")
    public List<WebElement> country_list;




    public static void wait_list() {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        ///wait.until(ExpectedConditions.numberOfElementsToBeLessThan((By) element,108));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
    }



}
