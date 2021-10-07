package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.UpNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _09_Wish_List_Edit {
    DialogContent dd = new DialogContent();
    UpNav u=new UpNav();

    @Then("^Wish list delete all$")
    public void wishListDeleteAll() {

        dd.findElementAndDeleteAllFunction("wish_delete_list");
    }

    @When("^Naviget to Wish List$")
    public void navigetToWishList() {
        u.findElementAndClickFunction("wish_list");
        dd.current("");
    }

    @Then("^Add wish list$")
    public void addWishList() {
        dd.findElementAndListselecetFunction("wish_liste_sache");
    }
}
