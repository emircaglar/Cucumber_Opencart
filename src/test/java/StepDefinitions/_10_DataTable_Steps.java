package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.UpNav;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class _10_DataTable_Steps {
    LeftNav l=new LeftNav();
    DialogContent dd=new DialogContent();
    UpNav u=new UpNav();

    @And("^Click on the element in the LeftNav$")
    public void clickOnTheElementInTheLeftNav(DataTable dataTable) {
        List<String> elementsList=dataTable.asList(String.class);

        for (int i = 0; i < elementsList.size() ; i++) {

            l.findElementAndClickFunction(elementsList.get(i));
        }

    }

    @And("^Click on the element in the DialogContent$")
    public void clickOnTheElementInTheDialogContent(DataTable dataTable) {
        List<String> elementList=dataTable.asList(String.class);

        for (int i = 0; i <elementList.size() ; i++) {
            dd.findElementAndClickFunction(elementList.get(i));
        }
    }

    @And("^User sending the keys in the Dialog Content$")
    public void userSendingTheKeysInTheDialogContent(DataTable dataTable) {
        List<List<String>> elementsList=dataTable.asLists(String.class);
        for (int i = 0; i <elementsList.size() ; i++) {
            dd.findElementAndSendKeysFunction(elementsList.get(i).get(0),elementsList.get(i).get(1));
        }



    }

    @And("^Click on the element in the UpNav$")
    public void clickOnTheElementInTheUpNav(DataTable dataTable) {
        List<String> stringList=dataTable.asList(String.class);

        for (int i = 0; i <stringList.size() ; i++) {
            u.findElementAndClickFunction(stringList.get(i));
        }

    }
}
