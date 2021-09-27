package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftContent extends Parent {

    public LeftContent(){


        PageFactory.initElements(ErsteDriver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement adress_book;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement new_adress;

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
            case "new_adress":
                meinElement = new_adress;
                break;

        }

        ClickFunction(meinElement);
    }



}

