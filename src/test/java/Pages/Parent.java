package Pages;

import Utilities.ErsteDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parent {

public static void select(WebElement element){
    Select select=new Select(element);
    select.selectByIndex(Parent.getRandom(select.getOptions().size()));
}



    public static int getRandom(int max){

        return (int)(Math.random()*max)+1;
    }
}
