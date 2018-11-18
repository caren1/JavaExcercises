import Calculator.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    int a;
    int b;


    @Test
    public void shouldReturn4When2Add2() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void shouldReturn6When4Add2() {

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(4,2);

        //then
        Assert.assertEquals(6, result);
    }
}
