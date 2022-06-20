import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

    public class TestParameterizedFeline {
    private final int firstNumber;
    private final int expected;
    public TestParameterizedFeline(int firstNumber, int expected){
        this.firstNumber = firstNumber;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getKittens() {
        return new Object[][] {
                { 1, 1},
                { 0, 0},
                { -1, -1},
        };
    }
    @Test
    public void shouldBeEquals(){
        Feline feline = new Feline();
        int actual = feline.getKittens(firstNumber);
        assertEquals(expected, actual);
    }
}
