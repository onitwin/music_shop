import Items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings steel;


    @Before
    public void before(){
        steel=new GuitarStrings("Steel",50,100);
    }

    @Test
    public void canGetName(){
        assertEquals("Steel",steel.getName());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(50.0,steel.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(100,steel.getSellCost(),0.01);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(50,steel.calculateMarkup(),0.1);
    }
}