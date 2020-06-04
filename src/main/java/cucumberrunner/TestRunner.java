package cucumberrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/cucumber/features/",
    glue = "steps",
   //tags = {"@Task6a"},
    plugin = {"pretty", "html:out"})
public class TestRunner {

}
