package StepDefinitions;

import Pages.DialogContent;
import Utilities.ErsteDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class _01_LoginSteps {

    DialogContent d = new DialogContent();


    @Given("^Naviget to Opencart$")
    public void navigat_to_Opencart() {

        WebDriver driver = ErsteDriver.getDriver();
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        driver.manage().window().maximize();


    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button() {
        //asd@gmail.com  123qweasd
        //d.input_username.sendKeys("asd@gmail.com");
        //d.input_password.sendKeys("123qweasd");
        //d.login_button.click();
       //WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
       //wait.until(ExpectedConditions.urlContains("login"));
       //d.cookies_button.click();
       //d.cookies_button_weiter.click();

        d.findElementAndSendKeysFunction("input_username","asd@gmail.com");
        d.findElementAndSendKeysFunction("input_password","123qweasd");
        d.findElementAndClickFunction("login_button");
        d.current("login");
        d.findElementAndClickFunction("cookies_button");
        d.findElementAndClickFunction("cookies_button_weiter");





    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("account"));
        Assert.assertEquals("My Account", d.my_account.getText());
    }

}
