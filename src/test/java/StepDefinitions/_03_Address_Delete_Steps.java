package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.Then;

public class _03_Address_Delete_Steps {
    DialogContent dd=new DialogContent();
    @Then("^Delete a address$")
    public void deleteAAddress() {
        dd.findElementAndDeleteFunction("delete_Address");
    }
}
