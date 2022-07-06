import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    private static final List<String> FOOD = List.of("Животные","Птицы", "Рыба");
    @Mock
    Lion lion;

    @Test
    public void testGetKittens(){
        Mockito.when(lion.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
    @Test
    public void testGetFood() throws Exception{
        Mockito.when(lion.getFood()).thenReturn(FOOD);
        Assert.assertEquals(FOOD, lion.getFood());
    }

}
