package StepDefinitions;
import Utilities.ErsteDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void Before(){


    }


    @After
    public void After(){

        ErsteDriver.DriverQuit();
    }




}
