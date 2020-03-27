import Items.GuitarStrings;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic mozart;
    SheetMusic bethoven;

    @Before
    public void before(){
        mozart=new SheetMusic("Mozarts Symphonies",10,20,"Mozart");
        bethoven= new SheetMusic("Bethovens 7th",20,40,"Bethoven");
    }

    @Test
    public void canGetName(){
        assertEquals("Mozarts Symphonies",mozart.getName());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(10.0,mozart.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(40,bethoven.getSellCost(),0.01);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(20,bethoven.calculateMarkup(),0.1);
    }

    @Test
    public void canGetMusician(){
        assertEquals("Mozart",mozart.getMusician());
    }
}

