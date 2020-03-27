import Enums.GuitarType;
import Enums.Type;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar fender;

    @Before
    public void before(){
        fender=new Guitar("Stratocaster", Type.STRING,"Fender",300,400, GuitarType.ELECTRIC);
    }

    @Test
    public void canGetName(){
        assertEquals("Stratocaster", fender.getName());
    }

    @Test
    public void canGetType(){
        assertEquals(Type.STRING,fender.getType());
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Fender",fender.getManufacturer());
    }

    @Test
    public void canGetPurchasedCost(){
        assertEquals(300,fender.getPurchasedCost(),0.1);
    }

    @Test
    public void canGetSellCost(){
        assertEquals(400,fender.getSellCost(),0.1);
    }

    @Test
    public void canGetGuitarType(){
        assertEquals(GuitarType.ELECTRIC,fender.getGuitarType());
    }

    @Test
    public void canGetSound(){
        assertEquals("Wahwahwahwah",fender.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals("33.0%",fender.calculateMarkup());
    }

}
