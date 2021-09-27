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
        l.findElementAndClickFunction("adress_book");
        l.findElementAndClickFunction("new_adress");
        dd.findElementAndSendKeysFunction("first_name","engin");
        dd.findElementAndSendKeysFunction("last_name","baytar");
        dd.findElementAndSendKeysFunction("address_1","cav cav cd 11");
        dd.findElementAndSendKeysFunction("input_city","istanbul");
        dd.findElementAndSendKeysFunction("input_postcode","12345");
        dd.findElementAndSelectFunction("input_country");
        DialogContent.wait_list();
        dd.findElementAndSelectFunction("input_zone");
        dd.findElementAndClickFunction("continue_address");

    }

    @Then("^New address should been create successfully$")
    public void new_address_should_been_create_successfully()  {

    }


}
