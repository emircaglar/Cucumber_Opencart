package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@RegressionTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = {
           "html:target/cucumber-report",
           "json:target/cucumber.json"

        }




)


public class _04_Cucumber_einfach_report extends AbstractTestNGCucumberTests {
}
