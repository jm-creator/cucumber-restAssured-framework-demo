package cucumber.Options;


import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = {"stepDefinations"})
public class TestRunner {
}
