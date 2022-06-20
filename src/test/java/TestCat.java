import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestCat {
    private static final String SOUND = "Мяу";
    private static final List<String> FOOD = List.of("Животные","Птицы", "Рыба");
    private static final List<String> NOTFOOD = List.of("Трава", "Различные растения");
    private static final List<String> INEDIBLE = List.of("Камень", "Земля");

    static Feline feline = new Feline();
    static Cat cat = new Cat(feline);
    @Test
    public void soundTest(){
        assertEquals(SOUND, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception{
        assertTrue(cat.getFood().containsAll(FOOD));
    }

}
