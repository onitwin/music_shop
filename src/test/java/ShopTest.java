import Enums.GuitarType;
import Enums.PianoType;
import Enums.TrumpetType;
import Enums.Type;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Trumpet;
import Items.DrumSticks;
import Items.GuitarStrings;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Guitar fender;
    Piano steinway;
    Trumpet getzen;
    DrumSticks oak;
    GuitarStrings steel;
    SheetMusic mozart;
    SheetMusic bethoven;
    Shop josephs;

    @Before
    public void before(){

        fender=new Guitar("Stratocaster", Type.STRING,"Fender",300,400, GuitarType.ELECTRIC);
        steinway=new Piano("Steinway", Type.PIANO,"Steinway & Sons",2000.00,5000.00, PianoType.GRAND);
        getzen=new Trumpet("Getzen", Type.BRASS,"Getzen",300,600, TrumpetType.FlLUGELHORN);
        oak=new DrumSticks("Super Oak",20,40);
        steel= new GuitarStrings("Steel",50,100);
        mozart=new SheetMusic("Mozarts Symphonies",10,20,"Mozart");
        bethoven= new SheetMusic("Bethovens 7th",20,40,"Bethoven");
        josephs= new Shop();

    }

    @Test
    public void startWithEmptyArray(){
        assertEquals(0,josephs.stock.size());
    }

    @Test
    public void canAddStock(){
        josephs.addStock(fender);
        assertEquals(1,josephs.stock.size());

    }
    @Test
    public void canAddMultipleStockTypes(){
        josephs.addStock(fender);
        josephs.addStock(mozart);
        josephs.addStock(oak);
        assertEquals(3,josephs.stock.size());
    }

    @Test
    public void canRemoveStock(){
        josephs.addStock(fender);
        josephs.addStock(mozart);
        josephs.addStock(oak);
        josephs.removeStock(oak);
        assertEquals(2,josephs.stock.size());

    }
    @Test
    public void canCalculateTotalValue(){
        josephs.addStock(fender);
        josephs.addStock(mozart);
        josephs.addStock(oak);
        josephs.addStock(getzen);
        assertEquals(430,josephs.totalMarkUp(),.1);

    }
}

