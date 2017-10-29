package se.enqvist.cucumber.support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/scenario/*.feature")
public class JUnitRunner {

    @Test
    public void sdf(){}


}
