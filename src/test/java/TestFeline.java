
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class TestFeline {
    private static final List<String> FOOD = List.of("Животные","Птицы", "Рыба");
    public static final String FAMILY = "Кошачьи";

    @Test
    public void testReturnKittens(){
        Feline feline = new Feline();
        Assert.assertEquals(1,feline.getKittens());

    }
    @Test
    public void shouldReturnFamily() {
        Feline feline = new Feline();
        Assert.assertEquals(FAMILY, feline.getFamily());
    }
//
  @Test
  public void getFoodTest() throws Exception{
      Feline feline = new Feline();
      assertTrue(feline.getFood("Хищник").containsAll(FOOD));
   }
    @Test
    public void getGrassFeedingTest() throws Exception{
        Feline feline = new Feline();
        assertFalse(feline.getFood("Травоядное").containsAll(FOOD));
    }
    @Test(expected = Exception.class)
    public void getNotFoodTest() throws Exception{
        Feline feline = new Feline();
        assertFalse(feline.getFood("Рыба").containsAll(FOOD));
    }
}
// дополнила тестами класс Feline для полного покрытия
