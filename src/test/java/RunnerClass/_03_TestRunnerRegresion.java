package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

        tags = {"@RegresionTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"}
)

public class _03_TestRunnerRegresion extends AbstractTestNGCucumberTests {
}
