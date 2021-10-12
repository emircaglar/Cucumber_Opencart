package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(ErsteDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement adress_book;

    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement edit_account;

    @FindBy(xpath = "//a[text()='Wish List']")
    public WebElement wish_list;



    WebElement meinElement;

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) { // wir mussen scroll und clear und send und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion


        }
        SendKeysFunction(meinElement, value);

    }

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "adress_book":
                meinElement = adress_book;
                break;
            case "wish_list":
                meinElement = wish_list;
                break;

            case "edit_account":
                meinElement = edit_account;
                break;

        }

        ClickFunction(meinElement);
    }


}

