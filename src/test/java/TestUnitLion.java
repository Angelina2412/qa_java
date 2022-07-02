import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;

public class TestUnitLion {
    private static final String SEX = "Самец";
    Feline felineMock = Mockito.mock(Feline.class);

    @Test
    public void getKittensMockTest() throws Exception {
        Lion lion = new Lion(felineMock, SEX);
        lion.getKittens();
        lion.getKittens();
        lion.getKittens();
        Mockito.verify(felineMock, times(3)).getKittens();
    }

    @Test
    public void getFoodMockTest() throws Exception {
        Lion lion = new Lion(felineMock, SEX);
        lion.getFood();
        Mockito.verify(felineMock, times(1)).eatMeat();


    }
}
// написала юнит тест, используя Мок