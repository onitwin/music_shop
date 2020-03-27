import Enums.PianoType;
import Enums.TrumpetType;
import Enums.Type;
import Instruments.Piano;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet getzen;

    @Before
    public void before(){
        getzen=new Trumpet("Getzen", Type.BRASS,"Getzen",300,600, TrumpetType.FlLUGELHORN);
    }

    @Test
    public void canGetName(){
        assertEquals("Getzen", getzen.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(Type.BRASS,getzen.getType());
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Getzen",getzen.getManufacturer());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(300,getzen.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(600,getzen.getSellCost(),0.1);
    }

    @Test
    public void canGetTrumpetType(){
        assertEquals(TrumpetType.FlLUGELHORN,getzen.getTrumpetType());
    }

    @Test
    public void canGetSound(){
        assertEquals("Parum-pom-pom-pom",getzen.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(300,getzen.calculateMarkup(),0.1);
    }

}
