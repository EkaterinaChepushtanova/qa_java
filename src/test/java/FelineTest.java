import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")), feline.eatMeat());
    }

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCountTest(){
        Feline feline = new Feline();
        Assert.assertEquals(3, feline.getKittens(3));
    }
}
