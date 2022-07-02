import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

public class TestUnitCat {
    @Test
    public void getFoodMockTest() throws Exception{
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);
        cat.getFood();
        cat.getFood();
        Mockito.verify(felineMock, times(2)).eatMeat();


    }

}
// написала юнит тест, используя Мок
