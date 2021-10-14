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

    @FindBy(css = "div[class='alert alert-success alert-dismissible']")
    public WebElement succesfull_input_assert;

    @FindBy(css = "td[class='text-right']>:nth-child(2)")
    public List<WebElement> delete_Address;

    @FindBy(css = "input[name='search']")
    public WebElement input_search;

    @FindBy(css = "button[class='btn btn-default btn-lg']")
    public WebElement button_search;

    @FindBy(xpath = "//i[@class='fa fa-heart']")
    public List<WebElement> liste_sache;

    @FindBy(css = "button[data-original-title='Add to Wish List']")
    public List<WebElement> wish_liste_sache;

    @FindBy(css = "a[class='btn btn-danger']")
    public List<WebElement> wish_delete_list;

    @FindBy(css = "table[class='table table-bordered table-hover']>tbody>tr>:nth-child(2)")
    public List<WebElement> wish_name_list;

    @FindBy(css = "div[class='col-sm-12']>:nth-child(7)")
    public WebElement search_empty;

    @FindBy(id = "input-firstname")
    public WebElement account_first_name;

    @FindBy(id = "input-lastname")
    public WebElement account_last_name;

    @FindBy(id = "input-telephone")
    public WebElement account_phone;

    @FindBy(css = "input[value='Continue']")
    public WebElement account_continue;

    @FindBy(css = "div[class='alert alert-success alert-dismissible']")
    public WebElement success_alert;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement new_adress;

    @FindBy(xpath = "(//button[@data-original-title='Add to Wish List']//i)[1]")
    public WebElement wish_erste_sache;

    @FindBy(xpath = "(//a[@class='btn btn-danger']//i)[1]")
    public WebElement wish_deleze_erste_sache;

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
            case "input_search":
                meinElement = input_search;
                break;
            case "input_postcode":
                meinElement = input_postcode;
                break;
            case "account_first_name":
                meinElement = account_first_name;
                break;
            case "account_last_name":
                meinElement = account_last_name;
                break;

            case "account_phone":
                meinElement = account_phone;
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
            case "button_search":
                meinElement = button_search;
                break;
            case "account_continue":
                meinElement = account_continue;
                break;

            case "new_adress":
                meinElement = new_adress;
                break;
            case "wish_erste_sache":
                meinElement = wish_erste_sache;
                break;

                case "wish_deleze_erste_sache":
                meinElement = wish_deleze_erste_sache;
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


    public void findElementAndAssertFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "succesfull_input_assert":
                meinElement = succesfull_input_assert;
                break;

            case "search_empty":
                meinElement = search_empty;
                break;

            case "success_alert":
                meinElement = success_alert;
                break;

        }
        AssertFunction(meinElement);
    }

    public void findElementAndAssert_empty_Function(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion

            case "search_empty":
                meinElement = search_empty;
                break;

        }
        Assert_empty_Function(meinElement);
    }


    List<WebElement> meineAddressList;

    public void findElementAndDeleteFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "delete_Address":
                meineAddressList = delete_Address;
                break;

        }
        DeleteFunction(meineAddressList);

    }

    public void findElementAndListselecetFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "wish_liste_sache":
                meineAddressList = wish_liste_sache;
                break;

        }
        InListSelectFunction(meineAddressList);

    }

    public void findElementAndDeleteAllFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "wish_delete_list":
                meineAddressList = wish_delete_list;
                break;

        }
        DeleteAllFunction(meineAddressList);

    }

    public void findElementAndInListSelectFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "liste_sache":
                meineAddressList = liste_sache;
                break;

        }
        InListSelectFunction(meineAddressList);

    }


    public void wait_list() {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan((By.cssSelector("select[id='input-zone']>option")), 107));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-zone")));
    }

    public void current(String value) {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains(value));
    }

}
