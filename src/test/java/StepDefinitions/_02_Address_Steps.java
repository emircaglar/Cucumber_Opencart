package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftContent;
import Pages.Parent;
import Utilities.ErsteDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class _02_Address_Steps {

    LeftContent l = new LeftContent();
    DialogContent dd=new DialogContent();

    @When("^Click address button dann new address create$")
    public void click_address_button_dann_new_address_create() {
        WebDriverWait wait = new WebDriverWait(ErsteDriver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(l.adress_book)).click();
        wait.until(ExpectedConditions.elementToBeClickable(l.new_adress)).click();
        dd.first_name.sendKeys("erhan");
        dd.last_name.sendKeys("eroglu");
        dd.address_1.sendKeys("cav cav cd 11");
        dd.input_city.sendKeys("ankara");
        dd.input_postcode.sendKeys("12345");
        Parent.select(dd.input_country);
        DialogContent.wait_list();
        Parent.select(dd.input_zone);
        dd.continue_address.click();
    }

    @Then("^New address should been create successfully$")
    public void new_address_should_been_create_successfully()  {

    }


}
