import com.qa.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {

    private Calculator calc;

    // GIVEN

    @Given("a calculator I just turned on")
    public void a_calculator_i_just_turned_on() {
        // Write code here that turns the phrase above into concrete actions
        calc = new Calculator();
        // throw new io.cucumber.java.PendingException();
    }


    // WHEN

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        calc.push(int1);
        calc.push(int2);
        calc.push("+");
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(Integer int1, Integer int2) {
        calc.push(int1); calc.push(int2); calc.push("-");
        throw new io.cucumber.java.PendingException();
    }


    // THEN

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        Number val = calc.value();
        assertEquals(expected, val);
    }

}
