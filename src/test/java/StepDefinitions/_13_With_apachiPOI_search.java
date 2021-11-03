package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.Then;

import java.util.List;

public class _13_With_apachiPOI_search {

    DialogContent dd=new DialogContent();
    @Then("^Select a product with ApachiPOI$")
    public void selectAProductWithApachiPOI() {
        List<List<String>> excelList= ExcelUtility.getList("src/test/java/apachePOI/resoucess/neuExcel.xlsx","Tabelle1",1);
        for (int i=0;i<excelList.size();i++){
        dd.findElementAndSendKeysFunction("input_search",excelList.get(i).get(0));
        dd.findElementAndClickFunction("button_search");}
    }
}
