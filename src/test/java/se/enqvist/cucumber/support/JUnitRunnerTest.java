package se.enqvist.cucumber.support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber/report.json" },
                features = "src/test/resources/scenario",
                glue = { "se.enqvist.cucumber.support" })
public class JUnitRunnerTest {

}


