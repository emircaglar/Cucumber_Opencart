package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNav1 extends Parent {

    public TopNav1(){
        PageFactory.initElements(ErsteDriver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='wishlist-total']")
    public WebElement wish_list;

    @FindBy(xpath = "//a[@title='Checkout']")
    public WebElement checkOut_button;

    WebElement meinElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "wish_list":
                meinElement = wish_list;
                break;
            case "checkOut_button":
                meinElement = checkOut_button;
                break;

        }
        ClickFunction(meinElement);
    }
    public void findElementAndSelectFunction(String elementName) {

        switch (elementName) { // wir mussen scroll und click und wait methoden benutzen
            // deswegen benuten wir hier switc und eine nutzliche Funktion
            case "wish_list":
                meinElement = wish_list;
                break;
            case "checkOut_button":
                meinElement = checkOut_button;
                break;

        }
        SelectFunction(meinElement);
    }


}

