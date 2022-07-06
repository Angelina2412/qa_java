import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLion {
    private static final List<String> FOOD = List.of("Животные","Птицы", "Рыба");
    private static final String MALE = "Самец";
    private static final String FEMALE = "Самка";
    private static final String NOGENDER = "Оно";
    private static final boolean MAIN = true;
    private static final boolean WITHOUTMAIN = false;

    private static final String EXCEPTION = "Используйте допустимые значения пола животного - самей или самка";
    private static final int KITTENS = 1;

    static Feline feline = new Feline();

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion(feline, MALE);
        assertTrue(lion.getFood().containsAll(FOOD));
    }
    @Test
    public void hasMainTest() throws Exception {
        Lion lion = new Lion(feline, MALE);
        assertEquals(MAIN, lion.doesHaveMane());
    }

    @Test
    public void hasNotMainTest() throws Exception {
        Lion lion = new Lion(feline, FEMALE);
        assertEquals(WITHOUTMAIN, lion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void hasNoGender() throws Exception {
        Lion lion = new Lion(feline, NOGENDER);
        assertEquals(WITHOUTMAIN, lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion(feline, MALE);
        assertEquals(KITTENS, lion.getKittens());
    }
}
// // дополнила тестами класс Lion для полного покрытия
