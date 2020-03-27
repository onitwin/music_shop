package Instruments;

import Behaviors.IPlay;
import Enums.PianoType;
import Enums.TrumpetType;
import Enums.Type;


public class Trumpet extends Instrument{
    private TrumpetType trumpetType;

    public Trumpet(String name, Type type, String manufacturer, double purchasedCost, double sellCost, TrumpetType trumpetType){
        super(name,type,manufacturer,purchasedCost,sellCost);
        this.trumpetType=trumpetType;
    }

    public String play(){
        return "Parum-pom-pom-pom";
    }

    public TrumpetType getTrumpetType(){
        return this.trumpetType;
    }


}
