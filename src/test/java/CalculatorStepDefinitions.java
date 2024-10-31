import com.qa.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {

    private Calculator calc;

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code here that turns the phrase above into concrete actions
        calc = new Calculator();

//        throw new io.cucumber.java.PendingException();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
    }

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        // Write code here that turns the phrase above into concrete actions
        Number val = calc.value();
        assertEquals(expected, val);
//        throw new io.cucumber.java.PendingException();
    }


}
