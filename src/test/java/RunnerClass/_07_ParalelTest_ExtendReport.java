package RunnerClass;

import Utilities.ErsteDriver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = { //basit rapor oluşturan plugin
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportSmoke.html"
        }
)
public class _07_ParalelTest_ExtendReport extends AbstractTestNGCucumberTests {


    @BeforeClass
    @Parameters("bowser")
    public void beforClass(String browser){
        ErsteDriver.threadBrowserName.set(browser);

    }


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
