package TestRunner;



import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/FeatureFiles", glue = {"MySteps"} , tags = "@test")
public class TestRunner {


}
