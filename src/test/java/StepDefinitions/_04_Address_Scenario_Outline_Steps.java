package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _04_Address_Scenario_Outline_Steps {

    LeftNav l=new LeftNav();
    DialogContent d=new DialogContent();

    @When("^Navigate to Address$")
    public void navigate_to_Address()  {
        l.findElementAndClickFunction("adress_book");
        l.findElementAndClickFunction("new_adress");



    }

    @Then("^Create a address  name as\"([^\"]*)\" surname as\"([^\"]*)\" address as\"([^\"]*)\"$")
    public void create_a_address_name_as_surname_as_address_as(String name, String surname, String address)  {
        System.out.println("name   = " + name+"surname = "+ surname+"address   = "+address );


    }

}
