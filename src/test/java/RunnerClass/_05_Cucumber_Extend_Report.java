package RunnerClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = { //basit rapor oluşturan plugin
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportSmoke.html"
        }
)

public class _05_Cucumber_Extend_Report extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void afterClass(){

        Reporter.loadXMLConfig("src/test/java/XMLFiles/Extend_Report_Set.xml");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Aplication name","Basqar");
        Reporter.setSystemInfo("User Name","emir");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");

        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");


    }

}
