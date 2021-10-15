package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpNav extends Parent {

    public UpNav() {
        PageFactory.initElements(ErsteDriver.getDriver(), this);
    }

    @FindBy(css = "a[id='wishlist-total']")
    public WebElement wish_list;

    WebElement meinElement;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "wish_list":
                meinElement = wish_list;
                break;

        }

        ClickFunction(meinElement);
    }


}

