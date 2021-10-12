package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_Address_Scenario_Outline_Steps {

    LeftNav l=new LeftNav();
    DialogContent dd=new DialogContent();

    @When("^Navigate to Address$")
    public void navigate_to_Address()  {
        l.findElementAndClickFunction("adress_book");
        dd.findElementAndClickFunction("new_adress");



    }

    @Then("^Create a address  name as\"([^\"]*)\" surname as\"([^\"]*)\" address as\"([^\"]*)\"$")
    public void create_a_address_name_as_surname_as_address_as(String name, String surname, String address)  {
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

}
