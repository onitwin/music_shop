import Enums.GuitarType;
import Enums.PianoType;
import Enums.Type;
import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano steinway;

    @Before
    public void before(){
        steinway=new Piano("Steinway", Type.PIANO,"Steinway & Sons",2000.00,5000.00, PianoType.GRAND);
    }

    @Test
    public void canGetName(){
        assertEquals("Steinway", steinway.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(Type.PIANO,steinway.getType());
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Steinway & Sons",steinway.getManufacturer());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(2000,steinway.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(5000,steinway.getSellCost(),0.1);
    }

    @Test
    public void canGetPianoType(){
        assertEquals(PianoType.GRAND,steinway.getPianoType());
    }

    @Test
    public void canGetSound(){
        assertEquals("Plink Plink Plink",steinway.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(3000,steinway.calculateMarkup(),0.1);
    }

}

