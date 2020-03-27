import Items.DrumSticks;
import Items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks oak;

    @Before
    public void before(){
        oak=new DrumSticks("Oak",100,200);
    }


    @Test
    public void canGetName(){
        assertEquals("Oak",oak.getName());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(100,oak.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(200,oak.getSellCost(),0.01);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(100,oak.calculateMarkup(),0.1);
    }

}
