package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.Then;

public class _07_Search_empty {
    DialogContent dd=new DialogContent();

    @Then("^Search musst been empty$")
    public void searchMusstBeenEmpty() {
        dd.findElementAndAssert_empty_Function("search_empty");
    }
}
