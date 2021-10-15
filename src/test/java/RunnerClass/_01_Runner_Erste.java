package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_login.feature","src/test/java/FeaturesFiles/_02_new_Adress.feature"},
        glue = {"StepDefinitions"}



)




public class _01_Runner_Erste extends AbstractTestNGCucumberTests {



}
