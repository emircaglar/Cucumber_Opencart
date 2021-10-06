package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class _08_Edit_Acoount {

    LeftNav l=new LeftNav();
    DialogContent dd=new DialogContent();
    @When("^Naviget to EditAcoount$")
    public void navigetToEditAcoount() {
        l.findElementAndClickFunction("edit_account");
    }

    @When("^Edit account name as\"([^\"]*)\" surname as \"([^\"]*)\" phone as \"([^\"]*)\"$")
    public void editAccountNameAsSurnameAsPhoneAs(String name, String surname, String phone) {
        dd.findElementAndSendKeysFunction("account_first_name",name);
        dd.findElementAndSendKeysFunction("account_last_name",surname);
        dd.findElementAndSendKeysFunction("account_phone",phone);
        dd.findElementAndClickFunction("account_continue");
        dd.current("account");
    }

}
