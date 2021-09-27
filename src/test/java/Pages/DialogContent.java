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

public class DialogContent extends Parent { // wir haben extend gemacht, weil wir in der Project ,
    // die Fonktion brauchen, die in Parent


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

    @FindBy(css = "input[class='btn btn-primary']")
    public WebElement continue_address;

    WebElement meinElement;

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) { // wir mussen scroll und clear und send und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "input_username":
                meinElement = input_username;
                break;
            case "input_password":
                meinElement = input_password;
                break;
            case "first_name":
                meinElement = first_name;
                break;
            case "last_name":
                meinElement = last_name;
                break;
            case "address_1":
                meinElement = address_1;
                break;
            case "input_city":
                meinElement = input_city;
                break;
            case "input_postcode":
                meinElement = input_postcode;
                break;

        }
        SendKeysFunction(meinElement, value);

    }

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "login_button":
                meinElement = login_button;
                break;
            case "cookies_button":
                meinElement = cookies_button;
                break;
            case "cookies_button_weiter":
                meinElement = cookies_button_weiter;
                break;
            case "continue_address":
                meinElement = continue_address;
                break;

        }

        ClickFunction(meinElement);
    }

    public void findElementAndSelectFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "input_country":
                meinElement = input_country;
                break;
            case "input_zone":
                meinElement = input_zone;
                break;

        }

        SelectFunction(meinElement);
    }


    public static void wait_list() {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan((By.cssSelector("select[id='input-zone']>option")), 108));
        /// wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
    }


}
