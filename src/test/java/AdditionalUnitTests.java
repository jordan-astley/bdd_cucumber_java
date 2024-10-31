import com.qa.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionalUnitTests {

    @Test
    public void add_int1_and_int2_returns_3() {
        int a, b;
        Number expectedAnswer = 3.0;
        a = 1; b = 2;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a); calc.push(b); calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    public void add_int2_and_int2_returns_3() {
        int a, b;
        Number expectedAnswer = 4.0;
        a = 2; b = 2;
        Calculator calc = new Calculator();
        // ACT
        calc.push(a); calc.push(b); calc.push("+");
        Number actualAnswer = calc.value();
        // ASSERT
        assertEquals(expectedAnswer, actualAnswer);
    }

}
