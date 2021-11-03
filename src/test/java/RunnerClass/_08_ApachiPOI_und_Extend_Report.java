package RunnerClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.apache.commons.math3.analysis.function.Abs;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        features = {"src/test/java/FeaturesFiles/_13_scenario_with_ApachiPOI.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/opencart_extentReport/with_ApachiPOI.html"}


)




public class _08_ApachiPOI_und_Extend_Report extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/Extend_Report_Set.xml");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Aplication name","opencart");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");


    }




}
