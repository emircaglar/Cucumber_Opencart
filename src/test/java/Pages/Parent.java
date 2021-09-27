package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent {

    public void SendKeysFunction(WebElement element, String value) {
        waitUntillVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);


    }

    public void ClickFunction(WebElement element) {
        waitUntillClickable(element);
        scrollToElement(element);
        element.click();
    }


    public void waitUntillVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void scrollToElement(WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor) ErsteDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);

    }


    public void waitUntillClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public static void select(WebElement element) {
        Select select = new Select(element);
        select.selectByIndex(Parent.getRandom(select.getOptions().size()));
    }

    public static int getRandom(int max) {

        return (int) (Math.random() * max) + 1;
    }
}
