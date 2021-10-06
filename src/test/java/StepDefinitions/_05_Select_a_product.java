package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav1;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _05_Select_a_product {
    DialogContent dd=new DialogContent();
    TopNav1 t=new TopNav1();


    @When("^Search a product as \"([^\"]*)\"$")
    public void searchAProductAs(String name) {
       dd.findElementAndSendKeysFunction("input_search",name);
       dd.findElementAndClickFunction("button_search");
    }

    @Then("^Select a product$")
    public void selectAProduct() {

        dd.findElementAndInListSelectFunction("liste_sache");

    }

    @Then("^Product muss in our Wishlist$")
    public void productMussInOurWishlist() {

        t.findElementAndClickFunction("wish_list");
    }
}
