package RunnerClass;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = ("StepDefinitions")

)

public class _02_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
