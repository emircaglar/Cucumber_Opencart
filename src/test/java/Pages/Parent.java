package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

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

    public void DeleteFunction( List<WebElement> meineAddressList) {
        WebElement element=meineAddressList.get(meineAddressList.size()-1);
        waitUntillClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void InListSelectFunction( List<WebElement> meineAddressList) {
            WebElement element=meineAddressList.get(getRandom(meineAddressList.size()-1));
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


    public void SelectFunction(WebElement element) {
        Select select = new Select(element);
        select.selectByIndex(Parent.getRandom(select.getOptions().size()));
    }

    public void  AssertFunction(WebElement element) {

        Assert.assertTrue(element.getText().contains("successfully"));
        System.out.println("element.getText() = " + element.getText());
    }
  public void  Assert_empty_Function(WebElement element) {

        Assert.assertTrue(element.getText().contains("Your shopping cart is empty!"));
        System.out.println("element.getText() = " + element.getText());
    }

    public static int getRandom(int max) {

        return (int) (Math.random() * max) + 1;
    }

    public static void schlafen(int max) {


        try {
            Thread.sleep(max*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
