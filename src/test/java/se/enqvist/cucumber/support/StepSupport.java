package se.enqvist.cucumber.support;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.core.IsEqual;
import se.enqvist.cucumber.FizzBuzz;

import static org.junit.Assert.assertThat;

public class StepSupport {

    private int number;
    private FizzBuzz fizzBuzz = new FizzBuzz();
    private String actualString;

    @Given("^the number (\\d+)$")
    public void inputNumber(int number) throws Throwable {
        this.number = number;
    }

    @When("^I ask for the string$")
    public void iAskForTheString() throws Throwable {
        actualString = fizzBuzz.fizzBuzz(number);
    }

    @Then("^The string should be (.*)$")
    public void theStringShouldBeFizz(String fizzBuzz) throws Throwable {
        if("empty".equals(fizzBuzz)){
            assertThat("String is not empty", actualString, IsEqual.equalTo(""));
        }else{
            assertThat("String is not correct", actualString, IsEqual.equalTo(fizzBuzz));
        }
    }

    @Given("^a number (\\d+)$")
    public void aNumber(int number) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.number = number;
    }

    @Then("^the string should be (.*)$")
    public void theStringShouldBeExpected(String fizzBuzz) throws Throwable {
        assertThat("String is not correct", actualString, IsEqual.equalTo(fizzBuzz));
    }
}
