package RunnerClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(

        tags = {"@RegressionTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)



public class _06_Extendt_Report_2 extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/Extend_Report_Set.xml");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Aplication name","opencart");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");


    }

}
