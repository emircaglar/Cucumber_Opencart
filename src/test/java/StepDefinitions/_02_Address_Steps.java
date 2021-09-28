package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_Address_Steps {

    LeftNav l = new LeftNav();
    DialogContent dd = new DialogContent();

    @When("^Click address button dann new address create$")
    public void click_address_button_dann_new_address_create() {
        l.findElementAndClickFunction("adress_book");
        l.findElementAndClickFunction("new_adress");
        dd.findElementAndSendKeysFunction("first_name", "engincan");
        dd.findElementAndSendKeysFunction("last_name", "baytarcan");
        dd.findElementAndSendKeysFunction("address_1", "can can  cd 11");
        dd.findElementAndSendKeysFunction("input_city", "istanbul");
        dd.findElementAndSendKeysFunction("input_postcode", "12345");
        dd.findElementAndSelectFunction("input_country");
        dd.wait_list();
        dd.findElementAndSelectFunction("input_zone");
        dd.findElementAndClickFunction("continue_address");

    }


    @When("^Click address button dann new address create name as \"([^\"]*)\" surname as \"([^\"]*)\" adress as \"([^\"]*)\"$")
    public void click_address_button_dann_new_address_create_name_as_surname_as_adress_as(String name, String surname,  String address) {
        l.findElementAndClickFunction("adress_book");
        l.findElementAndClickFunction("new_adress");
        dd.findElementAndSendKeysFunction("first_name", name);
        dd.findElementAndSendKeysFunction("last_name", surname);
        dd.findElementAndSendKeysFunction("address_1", address);
        dd.findElementAndSendKeysFunction("input_city", "istanbul");
        dd.findElementAndSendKeysFunction("input_postcode", "12345");
        dd.findElementAndSelectFunction("input_country");
        dd.wait_list();
        dd.findElementAndSelectFunction("input_zone");
        dd.findElementAndClickFunction("continue_address");

    }



    @Then("^New address should been create successfully$")
    public void new_address_should_been_create_successfully() {
        dd.current("address");
        dd.findElementAndAssertFunction("succesfull_input_assert");
    }


}
