import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class CalculatorParameterizedTest {

    @RunWith(Parameterized.class)
    public static class addTest {
        private int inputNumberA;
        private int inputNumberB;
        private int expectedResult;
        private Calculator1 calculator;

        @Before
        public void initalize() {
            calculator = new Calculator1();
        }

        public addTest(int inputNumberA, int inputNumberB, int expectedResult) {
            this.inputNumberA = inputNumberA;
            this.inputNumberB = inputNumberB;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters(name = "[index]: testAdd ({0}+{1})={2}")
        public static Collection<Object[]> addNumbers() {
            return Arrays.asList(new Object[][]{
                    {1, 1, 2},
                    {2, 1, 3},
                    {1, 2, 3}
            });
        }

        @Test
        public void testAdding() {
            assertEquals(expectedResult, calculator.add(inputNumberA, inputNumberB));

        }
    }
}
